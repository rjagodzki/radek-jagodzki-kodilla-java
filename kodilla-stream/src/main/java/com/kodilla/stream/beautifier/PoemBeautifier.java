package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, String nicerText, PoemDecorator poemDecorator){
        String result = poemDecorator.decorator(text, nicerText);
        System.out.println("Result: " + result);
    }
}
