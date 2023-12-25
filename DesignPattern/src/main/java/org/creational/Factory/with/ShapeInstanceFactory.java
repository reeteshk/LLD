package org.creational.Factory.with;

public class ShapeInstanceFactory {

        public static Shape getShape(String shapeType) {
            if (shapeType == null) {
                return null;
            }
            if (shapeType.equalsIgnoreCase("Square")) {
                return new Square();
            } else if (shapeType.equalsIgnoreCase("Rectangle")) {
                return new Rectangle();
            } else if (shapeType.equalsIgnoreCase("Circle")) {
                return new Circle();
            }
            return null;
        }
}
