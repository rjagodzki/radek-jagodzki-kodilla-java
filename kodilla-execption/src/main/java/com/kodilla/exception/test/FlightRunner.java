package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("London", "Madrid");
        FindFlight findFlight1 = new FindFlight();
        try{
            findFlight1.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println(e);
        }

    }
}
