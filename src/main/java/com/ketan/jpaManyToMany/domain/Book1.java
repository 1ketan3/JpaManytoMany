package com.ketan.jpaManyToMany.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ketan.jpaManyToMany.domain.Publisher;

@Entity
public class Book1
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JsonBackReference
    @JoinTable(name = "book1_publisher", joinColumns = @JoinColumn(name = "book1_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "id"))
    private List<Publisher> publishers=new ArrayList<>();


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

    public List<Publisher> getPublishers() {
        return publishers;
    }


    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }
}
