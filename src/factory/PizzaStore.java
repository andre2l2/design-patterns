package factory;

import factory.pizzas.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;
    Pizza pizza = null;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        this.pizza = factory.createPizza(type);
        this.pizza.prepare();
        this.pizza.bake();
        this.pizza.cut();
        this.pizza.box();
        return this.pizza;
    }
}
