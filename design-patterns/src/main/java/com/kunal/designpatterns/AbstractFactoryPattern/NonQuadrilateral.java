package com.kunal.designpatterns.AbstractFactoryPattern;

import com.kunal.designpatterns.FactoryPattern.Circle;
import com.kunal.designpatterns.FactoryPattern.Rectangle;
import com.kunal.designpatterns.FactoryPattern.Shape;
import com.kunal.designpatterns.FactoryPattern.ShapeFactory;

public class NonQuadrilateral implements ShapeFactory {

//    @Override
//    public Shape getObj(String input) {
//        return new ShapeFactory().drawShape(input);
//    }

    @Override
    public Shape getShape(String input) {
        switch (input) {
            case "circle":
                return new Circle();
            default:
                return null;
        }
    }
}
