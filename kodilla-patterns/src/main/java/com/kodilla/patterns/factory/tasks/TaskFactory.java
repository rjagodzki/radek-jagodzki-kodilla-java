package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task executeTask(final String taskName){
        switch(taskName){
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping","Milk", 2.0);
            case PAINTING_TASK:
                return new PaintingTask("Painting","white","wall");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "City","Car");
            default:
                return null;

        }
    }
}
