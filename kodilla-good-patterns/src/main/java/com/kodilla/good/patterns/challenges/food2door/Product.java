package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;

public class Product {
    private String nameOfProduct;
    private BigDecimal quantity;
    private BigDecimal price;

    public Product(String nameOfProduct, BigDecimal quantity, BigDecimal price) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
