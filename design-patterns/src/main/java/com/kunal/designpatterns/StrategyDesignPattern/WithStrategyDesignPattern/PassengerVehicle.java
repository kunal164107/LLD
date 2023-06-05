package com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern;

import com.kunal.designpatterns.StrategyDesignPattern.WithStrategyDesignPattern.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalDrive());
    }
}
