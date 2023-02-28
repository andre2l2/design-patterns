package decorator;

import decorator.beverages.Expresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;

public class StarBuzzCoffee {
    public static void run() {
        Beverage beverage = new Expresso();
        System.out.println("Description: " + beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println("Description: " + beverage2.getDescription() + " $" + beverage2.cost());
    }
}

