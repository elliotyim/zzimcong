package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name = "primary_categories")
public class PrimaryCategory {
    @Id
    private String id;
    private String name;

    @OneToMany(mappedBy = "primaryCategory")
    private Set<Category> categories;
}
