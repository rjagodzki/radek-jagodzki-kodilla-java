package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("To do");
        board.getInProgressList().getTasks().add("In progress");
        board.getDoneList().getTasks().add("Done");

        //Then
        System.out.println(board.toDoList.getTasks());
        System.out.println(board.inProgressList.getTasks());
        System.out.println(board.doneList.getTasks());
    }
}
