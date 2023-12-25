package org.Structural.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.Description() + " " + coffee.cost());

        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.Description() + " " + coffeeWithMilk.cost());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println(coffeeWithMilkAndSugar.Description() + " " + coffeeWithMilkAndSugar.cost());
    }
}
