package com.kodilla.fourth.second;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        OrdersOne ordersOne = new OrdersOne(1,"Milk");
        OrdersOne ordersOne1 = new OrdersOne(1,"Milk");
        OrdersOne ordersOne2 = new OrdersOne(1,"Milk");
        OrdersTwo ordersTwo = new OrdersTwo(2,"Eggs");

        HashMap <Integer, OrdersOne> map = new HashMap<>();
        map.put(1,ordersOne);
        map.put(2,ordersOne1);
        map.put(3,ordersOne2);



        System.out.println("Pokaz " + map.toString());

    }
}
