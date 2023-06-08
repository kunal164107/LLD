package com.kunal.designpatterns.DecoratorDesignPattern;

import com.kunal.designpatterns.DecoratorDesignPattern.Decorator.ExtraCheese;
import com.kunal.designpatterns.DecoratorDesignPattern.Decorator.Mushroom;
import com.kunal.designpatterns.DecoratorDesignPattern.Pizza.BasePizza;
import com.kunal.designpatterns.DecoratorDesignPattern.Pizza.FarmHousePizza;
import com.kunal.designpatterns.DecoratorDesignPattern.Pizza.MargheritaPizza;

public class Main {

    public static void main(String args[]) {

        BasePizza basePizza = new MargheritaPizza();
        System.out.println("Your pizza cost is " + basePizza.cost());

        BasePizza margheritaWithExtraCheese = new ExtraCheese(basePizza);
        System.out.println("Your pizza cost with Extra Cheese is " + margheritaWithExtraCheese.cost());

        BasePizza margheritaWithExtraCheeseAndMushroom = new Mushroom(margheritaWithExtraCheese);
        System.out.println("Your pizza cost with Extra Cheese and Mushroom is " + margheritaWithExtraCheeseAndMushroom.cost());
    }
}
