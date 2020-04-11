package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaWithSalamiCornMushroomsPepperAndExtraCheeseGetCost() {
        // Given
        Pizza pizza = new BasicPizza();
        pizza = new SalamiDecorator(pizza);
        pizza = new CornDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new PepperDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        // When
        BigDecimal theCost = pizza.getCost();
        //
        assertEquals(new BigDecimal(40), theCost);
    }
    @Test
    public void testPizzaWithSalamiCornMushroomsPepperAndExtraCheeseGetIngredients() {
        // Given
        Pizza pizza = new BasicPizza();
        pizza = new SalamiDecorator(pizza);
        pizza = new CornDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new PepperDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        // When
        String ingredients = pizza.getIngredients();
        // Then
        assertEquals("Pizza with base + tomato sauce + basic cheese + salami + corn + mushrooms + pepper + extra cheese",
                ingredients);
    }
}
