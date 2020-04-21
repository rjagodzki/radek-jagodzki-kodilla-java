package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightBrowser {
    private FlightSchedule flightSchedule;

    public FlightBrowser(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public List<Flight> flightsScheduleFrom(String requestedAirport) {
        return flightSchedule.getFlights().stream()
                .filter(f -> f.getFrom().equals(requestedAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsScheduleTo(String requestedAirport) {
        return flightSchedule.getFlights().stream()
                .filter(f -> f.getTo().equals(requestedAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsScheduleFromWithTransit(String requestedAirport, String transit, String destination) {
        List<Flight> toTransit =  flightSchedule.getFlights().stream()
                .filter(f -> f.getFrom().equals(requestedAirport))
                .filter(f -> f.getTo().equals(transit))
                .collect(Collectors.toList());

        List<Flight> afterTransit = flightSchedule.getFlights().stream()
                .filter(f->f.getFrom().equals(transit))
                .filter(f -> f.getTo().equals(destination))
                .collect(Collectors.toList());

        toTransit.addAll(afterTransit);
        return toTransit;
    }
}