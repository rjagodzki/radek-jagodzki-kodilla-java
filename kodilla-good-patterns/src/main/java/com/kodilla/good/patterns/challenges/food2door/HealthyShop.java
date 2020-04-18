package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Shop{
    private String nameOfShop;
    private Product product;

    public HealthyShop(String nameOfShop, Product product) {
        this.nameOfShop = nameOfShop;
        this.product = product;
    }
    @Override
    public String getNameOfShop() {
        return nameOfShop;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void process() {
        System.out.println("Welcome to: " + getNameOfShop());
        System.out.println("Our shop is lucky to see you");
        System.out.println("You ordered: " + product.getNameOfProduct());
        System.out.println("Price to pay: " + (product.getPrice().multiply(product.getQuantity())));
    }
}
