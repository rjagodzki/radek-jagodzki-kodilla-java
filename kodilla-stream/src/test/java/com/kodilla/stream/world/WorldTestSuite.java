package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        //When
        world.addContinent(new Continent("Asia",new Country("China", new BigDecimal("1384688986"))));
        world.addContinent(new Continent("Asia",new Country("Japan", new BigDecimal("126168156"))));
        world.addContinent(new Continent("Asia",new Country("India", new BigDecimal("1296834042"))));
        world.addContinent(new Continent("Europe",new Country("Poland", new BigDecimal("38420687"))));
        world.addContinent(new Continent("Europe",new Country("Germany", new BigDecimal("80457737"))));
        world.addContinent(new Continent("Europe",new Country("France", new BigDecimal("67364357"))));
        world.addContinent(new Continent("NorthAmerica",new Country("USA", new BigDecimal("262787403"))));
        world.addContinent(new Continent("NorthAmerica",new Country("Canada", new BigDecimal("35881659"))));//niesamowite pradwa? :P
        world.addContinent(new Continent("NorthAmerica",new Country("Mexico", new BigDecimal("125959205"))));
        world.addContinent(new Continent("Africa",new Country("RPA", new BigDecimal("55380210"))));
        world.addContinent(new Continent("Africa",new Country("Tunisia",new BigDecimal("11516189"))));
        world.addContinent(new Continent("Africa",new Country("Sudan", new BigDecimal("43120843"))));

//        BigDecimal expectedSand = new BigDecimal((world.getPeopleQuantity().val);
       BigDecimal expectedValue = new BigDecimal("3528573474");
//        BigDecimal expectedValue = new BigDecimal("0");
//       System.out.println(expectedSand);
        //Then

            Assert.assertEquals(expectedValue,world.getPeopleQuantity());

    }
}
