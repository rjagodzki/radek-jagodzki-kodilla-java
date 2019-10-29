package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public void exceptionHandling(){
        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            secondChallenge.probablyIWillThrowException(1,1);

        } catch (Exception e){
            System.out.println("Exception: " + e);
        }finally {
            System.out.println("I am here anyway");
        }

    }
}

