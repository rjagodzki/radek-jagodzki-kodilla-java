package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
            //Creating continents
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent africa = new Continent("Africa");

            //Adding continents to listOfContinents
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(africa);

            //Adding countries to listOfCountries for each created continent
        asia.addCountry(new Country("China", new BigDecimal("1384688986")));
        asia.addCountry(new Country("Japan", new BigDecimal("126168156")));
        asia.addCountry(new Country("India", new BigDecimal("1296834042")));

        europe.addCountry(new Country("Poland", new BigDecimal("38420687")));
        europe.addCountry(new Country("Germany", new BigDecimal("80457737")));
        europe.addCountry(new Country("France", new BigDecimal("67364357")));

        northAmerica.addCountry(new Country("USA", new BigDecimal("262787403")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("35881659")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("125959205")));

        africa.addCountry(new Country("RPA", new BigDecimal("55380210")));
        africa.addCountry(new Country("Tunisia",new BigDecimal("11516189")));
        africa.addCountry(new Country("Sudan", new BigDecimal("43120843")));

        //When
       BigDecimal expectedValue = new BigDecimal("3528579474");

       //Then
       Assert.assertEquals(expectedValue,world.getPeopleQuantity());
    }
}
