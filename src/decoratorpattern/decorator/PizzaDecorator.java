package src.decoratorpattern.decorator;

import src.decoratorpattern.Pizza;

public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost();
    }
}
