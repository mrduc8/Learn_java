package com.learnjava.DesignPattern.SingletonPattern;

public class SingleObject {
    public static SingleObject instance = new SingleObject();

    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello Word");
    }
}
