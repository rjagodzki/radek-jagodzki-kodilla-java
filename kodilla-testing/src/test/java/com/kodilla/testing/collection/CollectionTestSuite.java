package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite end");
    }
    @Before
    public void before(){
        System.out.println("Test case begin");
    }
    @After
    public void after(){
        System.out.println("Test case end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        System.out.println("Test OddNumbersExterminator EmptyList");

        //Given
        ArrayList<Integer> emptyArray = new ArrayList<>();
        emptyArray.isEmpty();
        ArrayList<Integer> arrayListToCompare = new ArrayList<>();
        arrayListToCompare.isEmpty();

        //When
        OddNumbersExterminator oddNumberExterminator = new OddNumbersExterminator(emptyArray);
        ArrayList exterminatedArray = oddNumberExterminator.exterminate(emptyArray);

        //Then
        Assert.assertEquals(arrayListToCompare,exterminatedArray);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Test OddNumberExterminator Normal List");

        //Given
        ArrayList<Integer> arrayToExterminate = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayToExterminate.add(i);
        }
        ArrayList<Integer> arrayWithOddNumbers = new ArrayList<>();
        int i = 0;
        while (i < 20) {
            arrayWithOddNumbers.add(i);
            i += 2;
        }

        //When
        OddNumbersExterminator oddNumberExterminator = new OddNumbersExterminator(arrayToExterminate);
        ArrayList<Integer> exterminatedArray = oddNumberExterminator.exterminate(arrayToExterminate);

        //Then
        Assert.assertEquals(arrayWithOddNumbers, exterminatedArray);
    }
}
