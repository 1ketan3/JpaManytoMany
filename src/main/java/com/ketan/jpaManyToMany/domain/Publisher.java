package com.ketan.jpaManyToMany.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Publisher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String name;

    @ManyToMany(mappedBy = "publishers",fetch=FetchType.LAZY)
    private List<Book1> book1=new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book1> getBook1() {
        return book1;
    }

    public void setBook1(List<Book1> book1) {
        this.book1 = book1;
    }
}
