package com.kunal.designpatterns.AbstractFactoryPattern;

import com.kunal.designpatterns.FactoryPattern.Shape;

public class Object {

    public Shape getObject(String input1, String input2) {
        switch (input1) {
            case "quadrilateral":
                return new Quadrilateral().getShape(input2);
            case "non-quadrilateral":
                return new NonQuadrilateral().getShape(input2);
            default:
                return null;
        }
    }
}
