package com.ketan.jpaManyToMany.controller;

import com.ketan.jpaManyToMany.domain.Publisher;
import com.ketan.jpaManyToMany.respository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController
{
    @Autowired
    private PublisherRepo publisherRepo;

    @PostMapping(value="/sdata")
    public String sdata(@RequestBody Publisher publisher)
    {
        publisherRepo.save(publisher);
        return "data inserted successfully into publisher";
    }
}
