package org.Structural.Decorator;

public class BasicCoffee implements Coffee{
    @Override
    public Double cost() {
        return 2.0;
    }

    @Override
    public String Description() {
        return "Basic Coffee";
    }
}
