package com.pattern.Decorator;

public class DecoratorClient {
    public static void main(String[] args){
        Beverage user1 = new Expresso();
        user1 = new Caramel(user1);
        user1 = new Mocha(user1);
        System.out.println("Total Beverage Cost " + user1.cost());
    }
}
