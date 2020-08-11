package com.company.StrategyPattern.Quacking;

import com.company.StrategyPattern.QuackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<<---Hello Silence my old friend---->>>>");
    }
}
