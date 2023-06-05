package com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern;

import com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.Drive;

public class Vehicle {

    private Drive drive;

    Vehicle(Drive drive) {
        this.drive = drive;
    }

    void drive() {
        drive.drive();
    }
}
