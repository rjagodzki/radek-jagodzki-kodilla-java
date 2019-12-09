package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Before
    public void beforeTest(){
        System.out.println("\n");
    }

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.executeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        if(shoppingTask.isTaskExecuted()) {
            System.out.println("Task has been executed already!");
        } else {
            shoppingTask.executeTask();
        }

        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.executeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        if(paintingTask.isTaskExecuted()) {
            System.out.println("Task has been executed already!");
        } else {
            paintingTask.executeTask();
        }

        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.executeTask(TaskFactory.DRIVING_TASK);

        drivingTask.executeTask();
        if(drivingTask.isTaskExecuted()) {
            System.out.println("Task has been executed already!");
        } else {
            drivingTask.executeTask();
        }

        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
