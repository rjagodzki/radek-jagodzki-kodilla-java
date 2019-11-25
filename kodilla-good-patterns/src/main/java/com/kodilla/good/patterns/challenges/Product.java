package com.kodilla.good.patterns.challenges;

public class Product {
    private final String name;
    private final double value;
    private final boolean available;

    public Product(String name, double value, boolean available) {
        this.name = name;
        this.value = value;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public boolean isAvailable() {
        return available;
    }

}
