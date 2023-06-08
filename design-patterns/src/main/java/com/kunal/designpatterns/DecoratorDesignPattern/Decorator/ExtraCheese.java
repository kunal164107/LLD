package com.kunal.designpatterns.DecoratorDesignPattern.Decorator;

import com.kunal.designpatterns.DecoratorDesignPattern.Pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
