package com.kodilla.good.patterns.challenges;

public class User {
    private final String name;
    private final String city;
    private final String street;

    public User(String name, String city, String street) {
        this.name = name;
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
