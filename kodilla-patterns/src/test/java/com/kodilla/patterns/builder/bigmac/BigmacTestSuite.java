package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacMaker() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With Sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients("Onion")
                .ingredients("Salad")
                .ingredients("Bacon")
                .ingredients("Cheese")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4,howManyIngredients);
    }
}
