package org.Structural.Decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public Double cost() {
        return coffeeDecorator.cost() + 1.0;
    }

    @Override
    public String Description() {
        return coffeeDecorator.Description() + " with Milk";
    }
}
