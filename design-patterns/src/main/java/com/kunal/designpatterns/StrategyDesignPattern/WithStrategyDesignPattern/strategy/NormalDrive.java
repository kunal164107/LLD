package com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy;

import com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.Drive;

public class NormalDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
