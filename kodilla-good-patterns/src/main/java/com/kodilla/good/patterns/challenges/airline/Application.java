package com.kodilla.good.patterns.challenges.airline;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        FlightCreator flightCreator = new FlightCreator();
        Airports airports = new Airports();
        airports.addAirport(new City("Warsaw"));
        airports.addAirport(new City("Danzing"));
        airports.addAirport(new City("Wrocław"));
        airports.addAirport(new City("London"));
        airports.addAirport(new City("Moscow"));
        airports.addAirport(new City("Paris"));

        flightCreator.createFlight(airports.getAirports().get(1), airports.getAirports().get(2));
        flightCreator.createFlight(airports.getAirports().get(0), airports.getAirports().get(1));
        flightCreator.createFlight(airports.getAirports().get(0), airports.getAirports().get(4));
        flightCreator.createFlight(airports.getAirports().get(0), airports.getAirports().get(4));
        flightCreator.createFlight(airports.getAirports().get(0), airports.getAirports().get(4));
//
//        for (Map.Entry<Integer, Integer> flight : flightCreator.getFlights().entrySet()) {
//            System.out.println(flightCreator.getFlightFrom().get(flight.getKey()) + " " +  flightCreator.getFlightTo().get(flight.getValue()));
//        }

       flightCreator.getFlightFrom().stream()
               .filter(f -> f.hashCode() == airports.getAirports().get(3).hashCode())
               .forEach(System.out::println);


    }
}
//            for (City cityFrom : flightCreator.getFlightFrom()) {
//                for (City cityTo : flightCreator.getFlightFrom()) {
//                    System.out.println();
//                }
//            }
