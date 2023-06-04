package com.kunal.designpatterns.SolidPrinciples.DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard{

    @Override
    public void type() {
        System.out.println("Typing through Wired KeyBoard");
    }
}
