package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "items")
public class Item {
    @Id
    private String id;
    private String name;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "item")
    private Set<ItemOption> itemOptions = new HashSet<>();

    @OneToMany(mappedBy = "item")
    private Set<StoreItem> storeItems = new HashSet<>();

    @OneToMany(mappedBy = "item")
    private Set<OrderItem> orderItems = new HashSet<>();
}
