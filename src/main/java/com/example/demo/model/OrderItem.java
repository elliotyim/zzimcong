package com.example.demo.model;

import com.example.demo.model.key.OrderItemKey;

import javax.persistence.*;

@Entity(name = "order_item")
@IdClass(OrderItemKey.class)
public class OrderItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_option_id")
    private ItemOption itemOption;
}
