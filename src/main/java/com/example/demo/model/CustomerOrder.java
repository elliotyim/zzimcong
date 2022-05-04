package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CustomerOrder {
    @Id
    private String id;
    private String message;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "customerOrder")
    private Set<Payment> payments = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "customer_order_item",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id")
    )
    private Set<Item> items = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "customer_order_item",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id")
    )
    private Set<ItemOption> itemOptions = new HashSet<>();
}
