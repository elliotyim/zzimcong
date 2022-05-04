package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ItemOption {
    @Id
    private String id;
    private String name;
    private String value;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToMany(mappedBy = "itemOptions")
    private Set<CustomerOrder> customerOrders = new HashSet<>();
}
