package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderService {
    public void completeOrder(String nameOfShop, Order order) {
        ShopService shopService = new ShopService();
        OrderValidator orderValidator = new OrderValidator();
        List<Shop> shops = shopService.listOfShops();
        for (Shop shop : shops) {
            if (shop.getNameOfShop().equals(nameOfShop)) {
                System.out.println("Order completed");
                shop.process();
                orderValidator.validator(order);
            }
        }


    }
}
