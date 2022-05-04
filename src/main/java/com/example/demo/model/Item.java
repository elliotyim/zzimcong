package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {
    @Id
    private String id;
    private String name;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "item")
    private Set<ItemOption> itemOptions;

    @ManyToMany
    @JoinTable(name = "store_item",
                joinColumns = @JoinColumn(name = "item_id"),
                inverseJoinColumns = @JoinColumn(name = "store_id"))
    private Set<Store> stores = new HashSet<>();

    @ManyToMany(mappedBy = "items")
    private Set<CustomerOrder> customerOrders = new HashSet<>();
}
