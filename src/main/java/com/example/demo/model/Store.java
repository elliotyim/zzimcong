package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "stores")
public class Store {
    @Id
    private String id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Customer customer;

    @OneToMany(mappedBy = "store")
    private Set<StoreItem> storeItems = new HashSet<>();
}
