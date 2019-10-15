package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")){
            System.out.println("Test ok");
        } else {
            System.out.println("Error!");
        }

        //Kolejny test
        System.out.println("Test - pierwszy test jednostkowy: ");

        Calculator calculator = new Calculator();

        System.out.println("Dodawanie: " + calculator.add(5,10));
        System.out.println("Odejmowanie: " +calculator.substract(10,9));

    }
}
