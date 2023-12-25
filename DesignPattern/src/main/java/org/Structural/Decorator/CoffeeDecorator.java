package org.Structural.Decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffeeDecorator;
    public CoffeeDecorator(Coffee coffee){
        this.coffeeDecorator = coffee;
    }
    @Override
    public Double cost() {
        return coffeeDecorator.cost();
    }

    @Override
    public String Description() {
        return coffeeDecorator.Description();
    }
}
