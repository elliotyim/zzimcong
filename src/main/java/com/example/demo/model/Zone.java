package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "zones")
public class Zone {
    @Id
    private String id;
    private String name;

    @OneToMany(mappedBy = "zone")
    private Set<Address> addresses = new HashSet<>();
}
