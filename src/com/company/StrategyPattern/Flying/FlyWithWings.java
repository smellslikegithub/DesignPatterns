package com.company.StrategyPattern.Flying;

import com.company.StrategyPattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with the wings God gave me");
    }
}
