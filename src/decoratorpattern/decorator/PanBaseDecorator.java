package src.decoratorpattern.decorator;

import src.decoratorpattern.Pizza;

public class PanBaseDecorator extends PizzaDecorator{

    public PanBaseDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public int cost() {
        return pizza.cost()  + 55;
    }
}
