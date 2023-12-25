package org.Structural.Decorator;

public class SugarDecorator extends CoffeeDecorator{

        public SugarDecorator(Coffee coffee){
            super(coffee);
        }
        @Override
        public Double cost() {
            return coffeeDecorator.cost() + 0.5;
        }

        @Override
        public String Description() {
            return coffeeDecorator.Description() + " with Sugar";
        }
}
