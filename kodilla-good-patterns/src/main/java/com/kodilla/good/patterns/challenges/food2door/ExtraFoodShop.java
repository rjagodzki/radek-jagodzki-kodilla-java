package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Shop {
    private String nameOfShop;
    private Product product;

    public ExtraFoodShop(String nameOfShop, Product product) {
        this.nameOfShop = nameOfShop;
        this.product = product;
    }
    @Override
    public String getNameOfShop() {
        return nameOfShop;
    }

    @Override
    public void process() {
        System.out.println("Welcome to: " + getNameOfShop());
        System.out.println("The Best Shop");
        System.out.println("You ordered: " + product.getNameOfProduct());
        System.out.println("Price to pay: " + (product.getPrice().multiply(product.getQuantity())));
    }
}
