package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "addresses")
public class Address {
    @Id
    private String id;
    private String postCode;
    private String line1;
    private String line2;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "zone_id")
    private Zone zone;
}
