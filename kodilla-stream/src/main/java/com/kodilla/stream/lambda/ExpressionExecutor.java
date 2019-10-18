package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void executorExpresion(double a, double b, MathExpresion mathExpresion){
        double result = mathExpresion.calculateExpression(a,b);
        System.out.println("Result equals: " + result);

    }
}
