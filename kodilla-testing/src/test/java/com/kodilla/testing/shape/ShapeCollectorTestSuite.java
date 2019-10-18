package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.ShapeCollector;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to excute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Circle",10 );
        Circle circle = new Circle("Circle", 10);
        //When
        shapeCollector.addFigure(circle);


        //Then


        Assert.assertEquals(null,shapeCollector.addFigure(circle));


    }


    @Test
    public void testRemoveFigure(){
        //Given
        //When
        //Then
    }

    @Test
    public void testGetFigure(){
        //Given
        //When
        //Then
    }

    @Test
    public void testShowFigures(){
        //Given
        //When
        //Then
    }

}
