package com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern;

import com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.SpecialDrive;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialDrive());
    }
}
