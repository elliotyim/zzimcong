package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "payments")
public class Payment {
    @Id
    private String id;
    private Integer amount;
    private String method;
    private Integer accPoint;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
