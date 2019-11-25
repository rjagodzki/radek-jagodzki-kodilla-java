package com.kodilla.fourth.second;

public class OrdersOne {
    private int productNumber;
    private String productName;

    public OrdersOne(int productNumber, String productName) {
        this.productNumber = productNumber;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrdersOne{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                '}';
    }
}
