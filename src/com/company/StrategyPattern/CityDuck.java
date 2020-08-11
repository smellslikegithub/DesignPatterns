package com.company.StrategyPattern;

import com.company.StrategyPattern.Flying.FlyWithWings;
import com.company.StrategyPattern.Quacking.Squeak;

public class CityDuck extends Duck {

    public CityDuck(String name){
        super(name);
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Hey I am the city duck, living the fine life! People call me " + this.getName());
    }
}
