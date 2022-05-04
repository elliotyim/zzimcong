package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
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
    private Set<CustomerOrder> customerOrders = new HashSet<>();
}
