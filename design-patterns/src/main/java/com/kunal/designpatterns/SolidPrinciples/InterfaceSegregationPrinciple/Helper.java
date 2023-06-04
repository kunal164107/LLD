package com.kunal.designpatterns.SolidPrinciples.InterfaceSegregationPrinciple;

public class Helper implements HelperInterface {

    @Override
    public void washDishes() {
        System.out.println("Washed Dishes Very Neatly");
    }
}
