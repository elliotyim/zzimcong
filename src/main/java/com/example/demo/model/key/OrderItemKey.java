package com.example.demo.model.key;

import java.io.Serializable;
import java.util.Objects;

public class OrderItemKey implements Serializable {
    private String order;
    private String item;
    private String itemOption;

    public OrderItemKey(String order, String item, String itemOption) {
        this.order = order;
        this.item = item;
        this.itemOption = itemOption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, item, itemOption);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else if (obj == null || this.getClass() != obj.getClass()) return false;
        OrderItemKey key = (OrderItemKey) obj;
        return key.order.equals(order) &&
                key.item.equals(item) &&
                key.itemOption.equals(itemOption);
    }
}
