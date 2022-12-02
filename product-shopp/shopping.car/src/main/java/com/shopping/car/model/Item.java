package com.shopping.car.model;


import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("item")
public class Item{

    private Integer productId;
    private Integer amount;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
