package com.example.demo.model;

import com.example.demo.model.key.StoreItemKey;

import javax.persistence.*;

@Entity(name = "store_item")
@IdClass(StoreItemKey.class)
public class StoreItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
