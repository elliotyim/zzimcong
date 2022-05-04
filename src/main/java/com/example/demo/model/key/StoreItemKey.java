package com.example.demo.model.key;

import java.io.Serializable;
import java.util.Objects;

public class StoreItemKey implements Serializable {
    private String store;
    private String item;

    public StoreItemKey() {}

    public StoreItemKey(String store, String item) {
        this.store = store;
        this.item = item;
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, item);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else if (obj == null || this.getClass() != obj.getClass()) return false;
        StoreItemKey key = (StoreItemKey) obj;
        return key.store.equals(store) &&
                key.item.equals(item);
    }
}
