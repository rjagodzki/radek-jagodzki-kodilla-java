package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Order {
    private boolean sent;
    private Shop shop;

    public void iterator(String shopName) {
        ShopService shopService = new ShopService();
        List<Shop> shops = shopService.listOfShops();
        for (Shop shop : shops) {
            if (shop.getNameOfShop().equals(shopName)) {
                this.shop = shop;
            }
            System.out.println("There is no shop with this name!");
        }
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return shop.getProduct();
    }

    public Order(boolean sent) {
        this.sent = sent;
    }

    public boolean isSent() {
        return sent;
    }
}
