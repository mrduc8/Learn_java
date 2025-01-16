package com.learnjava.DesignPattern.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RETANGLE")){
            return new RoundedRetangle();
        } else if (shapeType.equalsIgnoreCase("SQUERE")) {
            return new RoundedSquere();
        }
        return null;
    }
}
