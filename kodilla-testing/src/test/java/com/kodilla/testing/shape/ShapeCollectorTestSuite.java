package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    public static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle",10);
        Shape triangle = new Circle("Triangle",15);
        Shape square = new Square("Square",20);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(circle,shapeCollector.getFigure(0));
        Assert.assertEquals(triangle,shapeCollector.getFigure(1));
        Assert.assertEquals(square,shapeCollector.getFigure(2));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle",10);
        Shape triangle = new Circle("Triangle",15);
        Shape square = new Square("Square",20);

        //When
        boolean circleResult = shapeCollector.removeFigure(circle);
        boolean triangleResult = shapeCollector.removeFigure(triangle);
        boolean squareResult = shapeCollector.removeFigure(square);

        //Then
        Assert.assertFalse(circleResult);
        Assert.assertFalse(triangleResult);
        Assert.assertFalse(squareResult);


    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle",10);
        Shape triangle = new Circle("Triangle",15);
        Shape square = new Square("Square",20);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(circle,shapeCollector.getFigure(0));
        Assert.assertEquals(triangle,shapeCollector.getFigure(1));
        Assert.assertEquals(square,shapeCollector.getFigure(2));
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapeArrayListToCompare = new ArrayList<>();
        Shape circle = new Circle("Circle",10);
        Shape triangle = new Circle("Triangle",15);
        Shape square = new Square("Square",20);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        shapeArrayListToCompare.add(circle);
        shapeArrayListToCompare.add(triangle);
        shapeArrayListToCompare.add(square);

        //Then
        Assert.assertEquals(shapeArrayListToCompare,shapeCollector.showFigures());
    }
}
