package com.company.StrategyPattern;

public abstract class Duck {
    private String name;
    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public Duck(String name){
        this.name = name;
    }
    public void swim(){
        System.out.println("I am Swimming like a little Duck");
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public String getName(){
        return this.name;
    }
}
