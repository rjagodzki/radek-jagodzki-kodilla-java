package com.kodilla.good.patterns.challenges.airline;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addFlight(new Flight("Moscow", "Paris"));
        flightSchedule.addFlight(new Flight("Moscow", "Warsaw"));
        flightSchedule.addFlight(new Flight("Rome", "Prague"));
        flightSchedule.addFlight(new Flight("Warsaw", "Paris"));
        flightSchedule.addFlight(new Flight("Paris", "Warsaw"));
        flightSchedule.addFlight(new Flight("Rome", "Paris"));
        flightSchedule.addFlight(new Flight("Tokyo", "Warsaw"));
        flightSchedule.addFlight(new Flight("Delhi", "Warsaw"));
        flightSchedule.addFlight(new Flight("New York", "Warsaw"));
        flightSchedule.addFlight(new Flight("Mexico", "Warsaw"));

        FlightBrowser flightBrowser = new FlightBrowser(flightSchedule);
        List<Flight> flightsFrom = flightBrowser.flightsScheduleFrom("Moscow");
        List<Flight> flightsTo = flightBrowser.flightsScheduleTo("Warsaw");
        List<Flight> flightsFromWithTransit = flightBrowser.flightsScheduleFromWithTransit("New York", "Warsaw", "Paris");

        System.out.println(flightsFrom);
        System.out.println(flightsTo);
        System.out.println(flightsFromWithTransit);

    }
}
