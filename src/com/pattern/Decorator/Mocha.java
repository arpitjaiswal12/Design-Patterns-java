package com.pattern.Decorator;

public class Mocha extends AddOnDecorator{
    Beverage beverage ;
    public Mocha(Beverage b) {
        this.beverage = b;
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }
}
