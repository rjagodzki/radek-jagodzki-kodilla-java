package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Continent {
    private final String continentName;
    private final Country country;
    private final ArrayList<Country> listOfCountries = new ArrayList<>();
    public Continent(String continentName,Country country) {
        this.continentName = continentName;
        this.country = country;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCountry (Country country){
        listOfCountries.add(country);
    }
//    public BigDecimal getContinentQuantity(){
//        return listOfCountries.stream()
//                .map(country1 -> country1.getPeopleQuantity())
//                .reduce(BigDecimal.ZERO,(sum,current) -> (sum= sum.add(current)));
//    }

    public ArrayList<Country> getListOfCountries() {
        return listOfCountries;
    }

}
