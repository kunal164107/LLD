package com.kunal.designpatterns.AbstractFactoryPattern;

import com.kunal.designpatterns.FactoryPattern.Rectangle;
import com.kunal.designpatterns.FactoryPattern.Shape;
import com.kunal.designpatterns.FactoryPattern.ShapeFactory;

public class Quadrilateral implements ShapeFactory {

//    @Override
//    public Shape getObj(String input) {
//        return new ShapeFactory().drawShape(input);
//    }

    @Override
    public Shape getShape(String input) {
        switch (input) {
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
