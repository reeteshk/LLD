package org.creational.AbstractFactory.with;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price <= 300000){
            return new EconomicCar1();
        }else if(price > 300000){
            return new EconomicCar2();
        }
        return null;
    }
}
