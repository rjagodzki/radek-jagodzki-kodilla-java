package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.completeOrder("GlutenFreeShop", new Order(true));
    }
}
