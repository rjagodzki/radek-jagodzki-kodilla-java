package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        if(shape != null){
            shapes.add(shape);
        }
    }

    public boolean removeFigure(Shape shape){
        if(shape!=null){
            shapes.remove(shape);
        }
        return false;
    }

    public ArrayList<Shape> showFigures(){
        return shapes;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }
}
