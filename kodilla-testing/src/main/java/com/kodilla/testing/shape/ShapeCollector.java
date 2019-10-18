package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private String shapeName;
    private int field;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeCollector(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String addFigure(Shape shape){
        return null;
    }

    public void removeFigure(Shape shape){

    }

    public int getFigure(int n){
        return 100;
    }

    public void showFigures(){

    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }
}
