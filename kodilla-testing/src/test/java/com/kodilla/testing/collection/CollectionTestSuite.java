package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case begin");
    }
    @After
    public void after(){
        System.out.println("Test case end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.print("Test suite begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        System.out.println("Gdy lista posiada liczby parzyste i nieparzyste");
        //Given
        ArrayList<Integer> listToCompare = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator result = new OddNumbersExterminator(numbers);

            //Lista tworzona do porownania
        Integer i = 2;
        while(i<=20){
            listToCompare.add(i);
            i+=2;
        }

        //When
            //Lista przekazana do klasy OddNumbersExterminator
        i = 1;
        while(i<=20){
            numbers.add(i);
            i++;
        }

        //Then
        Assert.assertEquals(listToCompare,result.exterminate(numbers));
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        System.out.println("Gdy lista jest pusta");

        //Given
        ArrayList<Integer> listToCompare = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator result = new OddNumbersExterminator(numbers);

        //When
        Integer i = 1;
        while(i<=20){
            numbers.add(i);
            i++;
        }

        //Then
        Assert.assertNotEquals(listToCompare,result.exterminate(numbers));
    }
}
