package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ShopsList {
    private List<Shop> shops = new ArrayList<>();

    public boolean addShop(Shop shop) {
        return shops.add(shop);
    }

    public List<Shop> getShops() {
        return shops;
    }
}
