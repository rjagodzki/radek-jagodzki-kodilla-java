package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();

        List<Shop> shops = shopService.listOfShops();
        for(Shop shop :shops) {
            shop.process();
        }

    }
}
