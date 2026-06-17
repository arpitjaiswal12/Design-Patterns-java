package com.pattern.Decorator;

public class Caramel extends AddOnDecorator{
    Beverage beverage;
    public Caramel(Beverage b) {
        this.beverage = b;
    }
    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
