package com.kodilla.fourth.second;

public class OrdersTwo {
    private int productNumber;
    private String productName;

    public OrdersTwo(int productNumber, String productName) {
        this.productNumber = productNumber;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrdersTwo{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                '}';
    }
}
