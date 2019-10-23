package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import javafx.util.converter.BigDecimalStringConverter;
import javafx.util.converter.LocalDateStringConverter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args){
        System.out.println("Zadanie 7.3");
        LocalDate localDate = LocalDate.now();
        LocalDate localDateMinus20Years = localDate.minusYears(20);

        Forum forum = new Forum();
        LocalDate finalLocalDate = localDate;
        Map<Integer, ForumUser> userMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirth().isBefore(localDateMinus20Years))
                .filter(user -> user.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        userMap.entrySet().stream()
                .map(entry -> entry.getValue() )
                .forEach(System.out::println);


        System.out.println("\n\n");

        ////////////////////////////////////
        BookDirectory theBookDirectory4 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory4.getList().stream()
                .filter(book -> book.getYearOfPublication() >2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
        ///////////////////////////////////////
        BookDirectory theBookDirectory3 = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory3.getList().stream()
                .filter(book -> book.getYearOfPublication() < 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks);
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + entry.getValue())
                .forEach(System.out::println);
        //////////////////////////////////////
        BookDirectory theBookDirectory2 = new BookDirectory();
        List<Book> theResultListOfBook = theBookDirectory2.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBook.size());
        theResultListOfBook.stream()
                .forEach(System.out::println);
        ////////////////////////////////////////
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter((book -> book.getYearOfPublication() >2005))
                .forEach(System.out::println);


        //////////////////////////////////////////////
        System.out.println("\nPolaczenie filt i mappera");
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() >11)
                .map(s -> s.substring(0,s.indexOf( " ")+2)+ ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);

        ////////////////////////////////////////////////

        System.out.println("\nPrzez operacje filtrujaca z lamda");
        People.getList().stream()
                .filter(s-> s.length() >11)
                .forEach(System.out::println);
        /////////////////////////////////////
        System.out.println("\nPrzez wyrazenie lambda z mapperem");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        ////////////////////////////////////
        System.out.println("\n Podstawowe");
        People.getList().stream()
                .forEach(System.out::println);

       /////////////////////////////////////
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        ////////////////////////////////

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
