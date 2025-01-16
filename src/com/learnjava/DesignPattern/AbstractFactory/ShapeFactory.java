package com.learnjava.DesignPattern.AbstractFactory;


import com.learnjava.DesignPattern.FactoryPatternDemo.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RETANGLE")){
            return new Retangle();
        } else if (shapeType.equalsIgnoreCase("SQUERE")) {
            return  new Squere();
        }
        return null;
    }
}
