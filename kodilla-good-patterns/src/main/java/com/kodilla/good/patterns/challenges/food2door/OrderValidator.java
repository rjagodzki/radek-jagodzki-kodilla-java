package com.kodilla.good.patterns.challenges.food2door;

public class OrderValidator {
    public void validator(Order order) {
        EmailService emailService = new EmailService();
        if(order.isSent()) {
            emailService.email();
        } else {
            System.out.println("Something went wrong");
        }
    }
}
