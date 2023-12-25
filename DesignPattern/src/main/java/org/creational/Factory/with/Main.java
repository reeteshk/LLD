package org.creational.Factory.with;

public class Main {
    public static void main(String[] args) {
       ShapeInstanceFactory shapeFactory = new ShapeInstanceFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.computeArea();
        Shape shape2 = shapeFactory.getShape("Square");
        shape2.computeArea();
        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.computeArea();


    }
}
