package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "item_options")
public class ItemOption {
    @Id
    private String id;
    private String name;
    private String value;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @OneToMany(mappedBy = "itemOption")
    private Set<OrderItem> orderItems = new HashSet<>();
}
