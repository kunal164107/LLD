package com.kunal.designpatterns.SolidPrinciples.DependencyInversionPrinciple;

public class BluetoothMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Clicking through Bluetooth Mouse");
    }
}
