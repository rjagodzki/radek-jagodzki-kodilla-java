package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderService {
    public void completeOrder(Order order) {
        OrderValidator orderValidator = new OrderValidator();
        orderValidator.validator(order);
    }
}
