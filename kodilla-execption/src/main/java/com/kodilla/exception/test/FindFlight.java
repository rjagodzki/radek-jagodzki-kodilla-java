package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        Flight flight1 = new Flight(flight.getDepartureAirport(), flight.getArrivalAirport());

        Map<String, Boolean> airportAccess = new HashMap<>();

        airportAccess.put("London", true);
        airportAccess.put("Warsaw", false);
        airportAccess.put("Madrid", true);

        if (airportAccess.containsKey(flight.getArrivalAirport()) && airportAccess.containsKey(flight.getDepartureAirport())) {
            if(airportAccess.get(flight.getDepartureAirport()).booleanValue() && airportAccess.containsKey(flight.getArrivalAirport()))

                System.out.println("Flight from " + flight.getDepartureAirport() + " to " +flight.getArrivalAirport() + " is available");

            else {
                throw new RouteNotFoundException("Airport is unavailable");
            }
        }
        else {
             throw new RouteNotFoundException("Airport is unavailable");
        }

    }


}
