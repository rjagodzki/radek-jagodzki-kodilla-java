package com.kodilla.exception.main;


import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) throws ExceptionHandling {

        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        try {
            fileReader.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader1 = new FileReader();
        try {
            fileReader1.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
            e.printStackTrace();
        }
    }
}
