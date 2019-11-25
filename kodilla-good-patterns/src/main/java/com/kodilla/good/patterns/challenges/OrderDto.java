package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public Product product;
    public boolean inAvailable;

    public OrderDto(Product product, boolean inAvailable) {
        this.product = product;
        this.inAvailable = inAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isInAvailable() {
        return inAvailable;
    }
}
