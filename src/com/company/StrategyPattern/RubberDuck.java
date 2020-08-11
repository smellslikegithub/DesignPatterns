package com.company.StrategyPattern;

import com.company.StrategyPattern.Flying.NoFly;
import com.company.StrategyPattern.Quacking.NoQuack;

public class RubberDuck extends Duck {

    public RubberDuck(String name){
        super(name);
        this.quackBehavior = new NoQuack();
        this.flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("Hello I am " + this.getName());
    }

}
