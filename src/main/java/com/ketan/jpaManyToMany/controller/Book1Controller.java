package com.ketan.jpaManyToMany.controller;

import com.ketan.jpaManyToMany.domain.Book1;
import com.ketan.jpaManyToMany.respository.Book1Repo;
import com.ketan.jpaManyToMany.respository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book1Controller
{
    @Autowired
    private Book1Repo book1Repo;
    @Autowired
    private PublisherRepo publisherRepo;

    @PostMapping(value="/savedata")
    public  String savedata(@RequestBody Book1 book1)
    {
        book1Repo.save(book1);
        return "data of book1 successfully entered";
    }

    @PostMapping(value="/savemtomforbook")
    public String savemtomforbook(@RequestBody Book1 book1)
    {
        Book1 book11 = book1Repo.findOne(book1.getId());

        if(book11!=null)
        {
            publisherRepo.save(book1.getPublishers());
        }
        else
        {
            book1Repo.save(book1);
        }

        return "data of book and many publisher entered successfully entered";
    }
}
