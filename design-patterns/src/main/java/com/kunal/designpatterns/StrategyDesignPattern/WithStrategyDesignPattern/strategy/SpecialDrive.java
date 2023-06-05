package com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy;

import com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.Drive;

public class SpecialDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
