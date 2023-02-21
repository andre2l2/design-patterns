package factory.stores;

import factory.pizzas.Pizza;

public abstract class PizzaStore {
    Pizza pizza = null;

    public Pizza orderPizza(String type) {
        this.pizza = this.createPizza(type);
        this.pizza.prepare();
        this.pizza.bake();
        this.pizza.cut();
        this.pizza.box();
        return this.pizza;
    }

    public abstract Pizza createPizza(String type);
}
