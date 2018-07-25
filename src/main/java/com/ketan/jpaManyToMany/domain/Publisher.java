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

    @ManyToMany(mappedBy = "publishers",cascade = CascadeType.ALL)
    private Set<Book1> book1=new HashSet<>();

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

    public Set<Book1> getBook1() {
        return book1;
    }

    public void setBook1(Set<Book1> book1) {
        this.book1 = book1;
    }
}
