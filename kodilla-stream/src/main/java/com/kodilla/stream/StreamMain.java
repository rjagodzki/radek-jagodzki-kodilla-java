package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args){
        System.out.println("Poem Beautifier");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Moj tekst","Moj tekst", (text, nicerText)-> nicerText.toUpperCase());
        poemBeautifier.beautify("Moj tekst","ABC", (text, nicerText)-> nicerText + text + nicerText );
        poemBeautifier.beautify("Moj tekst","Moj tekst", (text, nicerText)-> nicerText.replace('e','a'));
        poemBeautifier.beautify("Moj tekst","Moj tekst", (text, nicerText)-> nicerText.substring(4,9));




        //////////////////////////////////////////////////
        System.out.println("Welcome to module 7 - stream");

        Processor processor = new Processor();
        processor.execute(()-> System.out.println("lamdba"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambda");
        expressionExecutor.executorExpresion(10, 5, (a, b) -> a + b);
        expressionExecutor.executorExpresion(10, 5, (a, b) -> a - b);
        expressionExecutor.executorExpresion(10, 5, (a, b) -> a * b);
        expressionExecutor.executorExpresion(10, 5, (a, b) -> a / b);
        //expressionExecutor.executorExpresion(1,5,);

        System.out.println("Calculating expressions with  method references");
        expressionExecutor.executorExpresion(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executorExpresion(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executorExpresion(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executorExpresion(3, 4, FunctionalCalculator::divideAByB);


    }
}
