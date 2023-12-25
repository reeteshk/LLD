package org.creational.AbstractFactory.with;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getFactoryInstance("Economic");
        Car car = abstractFactory.getInstance(100000);
        System.out.println(car.getTopSpeed());

        abstractFactory = abstractFactoryProducer.getFactoryInstance("Luxury");
        car = abstractFactory.getInstance(5000000);
        System.out.println(car.getTopSpeed());

    }
}
