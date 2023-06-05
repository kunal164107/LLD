package com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern;

import com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
