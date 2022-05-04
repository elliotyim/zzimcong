package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "categories")
public class Category {
    @Id
    private String id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "primary_category_id")
    private PrimaryCategory primaryCategory;

    @OneToMany(mappedBy = "category")
    private Set<Item> items;
}
