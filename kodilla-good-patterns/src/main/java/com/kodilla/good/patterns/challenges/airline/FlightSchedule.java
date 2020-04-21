package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
