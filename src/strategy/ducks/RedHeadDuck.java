package strategy.ducks;

import strategy.Duck;
import strategy.ducksBehavior.FlyWithWings;
import strategy.ducksBehavior.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new Quack(), new FlyWithWings());
    }

    public void display() {
        System.out.println("Show red head dick");
    }
}
