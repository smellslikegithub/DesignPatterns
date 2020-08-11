package com.company.StrategyPattern.Flying;

import com.company.StrategyPattern.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
