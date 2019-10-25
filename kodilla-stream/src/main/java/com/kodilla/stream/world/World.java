package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class World {
    //private final Continent continent;
    private final ArrayList<Continent> listOfContinents = new ArrayList<>();

    public ArrayList<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = null;
    return peopleQuantity = listOfContinents.stream()
            .flatMap(country -> country.getListOfCountries().stream())
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));
    //do zignorowania, tutaj cos kombinowalem.
//            for(BigDecimal country : )
            //.filter(country -> country.getPeopleQuantity() != null )
//           . ...collect(Collectors.summing(Country::getPeopleQuantity);
//            .collect(Collectors.toList())


    }


}
