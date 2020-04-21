package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void addMentor(Observer observer);
    void notifyMentor();
}
