package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "cities")
public class City {
    @Id
    private String id;
    private String name;

    @OneToMany(mappedBy = "city")
    private Set<Address> addresses = new HashSet<>();
}
