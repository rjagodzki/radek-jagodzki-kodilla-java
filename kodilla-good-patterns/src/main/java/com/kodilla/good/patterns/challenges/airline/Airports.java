package com.kodilla.good.patterns.challenges.airline;

import java.util.LinkedList;

import java.util.List;

public class Airports {
    private List<City> airports = new LinkedList<>();

    public void addAirport(City city) {
        airports.add(city);
    }

    public List<City> getAirports() {
        return airports;
    }
}

