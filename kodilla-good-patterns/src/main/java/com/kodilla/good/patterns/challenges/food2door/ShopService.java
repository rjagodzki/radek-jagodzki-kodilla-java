package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.List;

public class ShopService {

    public List<Shop> listOfShops() {
        Shop extraFoodShop = new ExtraFoodShop("ExtraFoodShop",new Product("Apple", new BigDecimal(4), new BigDecimal(2)));
        Shop healthyFoodShop = new HealthyShop("HealthyFoodShop", new Product("Apple", new BigDecimal(4), new BigDecimal(3)));
        Shop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", new Product("Apple", new BigDecimal(4), new BigDecimal(4)));

        ShopsList shopsList = new ShopsList();
        shopsList.addShop(extraFoodShop);
        shopsList.addShop(healthyFoodShop);
        shopsList.addShop(glutenFreeShop);

        return shopsList.getShops();
    }

}
