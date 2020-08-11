package com.company.StrategyPattern.Quacking;

import com.company.StrategyPattern.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("chippp chippp chippp Squeeeeeeeeeeeeeeek");
    }
}
