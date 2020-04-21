package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentsHomework implements Observable{
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String studentsName;

    public StudentsHomework(String studentsName) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.studentsName = studentsName;
    }

    public void addSolution(String task) {
        tasks.add(task);
        notifyMentor();
    }

    @Override
    public void addMentor(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyMentor() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentsName() {
        return studentsName;
    }
}
