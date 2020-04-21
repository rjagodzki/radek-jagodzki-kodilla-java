package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        // Given
        Mentor estelleSomething = new Mentor("Estelle Something");
        Mentor jackGeller = new Mentor("Jack Geller");
        StudentsHomework rachelsHomework = new StudentsHomework("Rachel");
        StudentsHomework monicasHomework = new StudentsHomework("Monica");
        StudentsHomework pheobeesHomework = new StudentsHomework("Pheobee");
        StudentsHomework joeysHomework = new StudentsHomework("Joey");
        StudentsHomework chandlersHomework = new StudentsHomework("Chandler");
        StudentsHomework rossHomework = new StudentsHomework("Ross");

        rachelsHomework.addMentor(estelleSomething);
        monicasHomework.addMentor(estelleSomething);
        pheobeesHomework.addMentor(estelleSomething);
        joeysHomework.addMentor(jackGeller);
        chandlersHomework.addMentor(jackGeller);
        rossHomework.addMentor(jackGeller);

        // When
        rachelsHomework.addSolution("Zadanie 0.1");
        rachelsHomework.addSolution("Zadanie 0.2");
        rachelsHomework.addSolution("Zadanie 0.3");

        monicasHomework.addSolution("Zadanie 0.1");
        monicasHomework.addSolution("Zadanie 0.2");
        monicasHomework.addSolution("Zadanie 0.3");
        monicasHomework.addSolution("Zadanie 0.4");
        monicasHomework.addSolution("Zadanie 0.5");
        monicasHomework.addSolution("Zadanie 1.1");

        pheobeesHomework.addSolution("Zadanie 1000.0000");

        joeysHomework.addSolution("Zadanie 0.0");

        chandlersHomework.addSolution("Zadanie 0.1");
        chandlersHomework.addSolution("Zadanie 0.2");
        chandlersHomework.addSolution("Zadanie 0.3");
        chandlersHomework.addSolution("Zadanie 0.4");
        chandlersHomework.addSolution("Zadanie 0.5");

        rossHomework.addSolution("Zadanie 0.1");
        rossHomework.addSolution("Zadanie 0.2");
        rossHomework.addSolution("Zadanie 0.3");
        rossHomework.addSolution("Zadanie 0.4");
        rossHomework.addSolution("Zadanie 0.5");
        rossHomework.addSolution("Zadanie 1.1");
        rossHomework.addSolution("Zadanie 1.2");
        rossHomework.addSolution("Zadanie 1.3");
        rossHomework.addSolution("Zadanie 1.4");
        rossHomework.addSolution("Zadanie 1.5");

        //Then
        assertEquals(10, estelleSomething.getUpdateCount());
        assertEquals(16, jackGeller.getUpdateCount());
    }

}