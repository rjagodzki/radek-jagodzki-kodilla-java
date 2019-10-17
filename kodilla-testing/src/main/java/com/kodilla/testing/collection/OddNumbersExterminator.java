package com.kodilla.testing.collection;



import java.util.*;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }


    public ArrayList<Integer> exterminate( ArrayList<Integer> numbers){
        ArrayList<Integer> exterminatedNumbers = new ArrayList<>();

        for(Integer number : numbers){
            if(number%2 == 0){
                exterminatedNumbers.add(number);
            }
        }

        return exterminatedNumbers;
    }

    public ArrayList<Integer> getNumbers(){
        return numbers;
    }
}
