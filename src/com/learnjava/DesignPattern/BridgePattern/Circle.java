package com.learnjava.DesignPattern.BridgePattern;

public class Circle extends Shape {
    private int radius, x, y;

    public Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {}
}
