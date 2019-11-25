package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Jan Kowalski", "Warszawa", "Śliczna 13");
        Product product = new Product("Gra planszowa Monopoly", 99.99, true);

        return new OrderRequest(user, product);
    }
}
