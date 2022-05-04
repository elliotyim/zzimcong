package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "customers")
public class Customer {
    @Id
    private String id;
    private String password;
    private String name;
    private String tel;
    private String mobile;
    private String email;

    @OneToMany(mappedBy = "customer")
    private Set<Store> stores = new HashSet<>();

    @OneToMany(mappedBy = "customer")
    private Set<Order> orders = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
