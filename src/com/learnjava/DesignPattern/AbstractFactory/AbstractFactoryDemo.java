package com.learnjava.DesignPattern.AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape  shape1 = shapeFactory.getShape("RETANGLE");
        shape1.draw();
        Shape  shape2 = shapeFactory.getShape("SQUERE");
        shape2.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape  shape3 = shapeFactory1.getShape("RETANLE");
        shape3.draw();
        Shape  shape4 = shapeFactory1.getShape("SQUERE");
        shape4.draw();
    }
}
