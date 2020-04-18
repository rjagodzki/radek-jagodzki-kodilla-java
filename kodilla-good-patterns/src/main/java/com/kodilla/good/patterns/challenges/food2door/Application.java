package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Order order = new Order(true);
        order.iterator("GlutenFreeShop");
        order.getShop().process();
        OrderService orderService = new OrderService();
        orderService.completeOrder(order);
    }
}
