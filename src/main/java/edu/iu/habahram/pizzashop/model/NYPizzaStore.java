package edu.iu.habahram.pizzashop.model;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = new NYPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}
