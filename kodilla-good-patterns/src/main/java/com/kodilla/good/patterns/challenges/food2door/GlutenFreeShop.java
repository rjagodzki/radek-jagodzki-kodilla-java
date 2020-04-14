package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Shop{
    private String nameOfShop;
    private Product product;

    public GlutenFreeShop(String nameOfShop, Product product) {
        this.nameOfShop = nameOfShop;
        this.product = product;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    @Override
    public void process() {
        System.out.println("Welcome to: " + getNameOfShop());
        System.out.println("No gluten here!");
        System.out.println("You ordered: " + product.getNameOfProduct());
        System.out.println("Price to pay: " + (product.getPrice().multiply(product.getQuantity())));
    }
}
