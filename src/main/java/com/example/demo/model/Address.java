package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "addresses")
public class Address {
    @Id
    private String id;
    private String postCode;
    private String line1;
    private String line2;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "zone_id")
    private Zone zone;
}
