package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Store {
    @Id
    private String id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Customer customer;

    @ManyToMany(mappedBy = "stores")
    private Set<Item> items;
}
