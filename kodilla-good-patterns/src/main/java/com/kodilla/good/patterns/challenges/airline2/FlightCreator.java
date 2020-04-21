package com.kodilla.good.patterns.challenges.airline2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FlightCreator {
    private List<City> flightFrom = new LinkedList<>();
    private List<City> flightTo = new LinkedList<>();

    private HashMap<Integer, Integer> flights = new HashMap<>();
    private int key = 0;

    public void createFlight(City from, City destination) {
        flightFrom.add(key,from);
        flightTo.add(key,destination);
        flights.put(key, key);
        key++;

    }

    public HashMap<Integer, Integer> getFlights() {
        return flights;
    }

    public List<City> getFlightFrom() {
        return flightFrom;
    }

    public List<City> getFlightTo() {
        return flightTo;
    }
}
