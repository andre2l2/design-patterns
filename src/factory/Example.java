package factory;

import factory.stores.NYPizzaStore;

public class Example {
    public static void run() {
        NYPizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.createPizza("Cheese");
    }
}
