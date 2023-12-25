package org.creational.AbstractFactory.with;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value){
        if(value.equalsIgnoreCase("Economic")){
            return new EconomicCarFactory();
        }else if(value.equalsIgnoreCase("Luxury") || value.equalsIgnoreCase("Premium")
                || value.equalsIgnoreCase("Sports")){
            return new LuxuryCarFactory();
        }
        return null;
    }
}
