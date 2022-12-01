package strategy.ducks;

import strategy.Duck;
import strategy.ducksBehavior.FlyNoWay;
import strategy.ducksBehavior.Quack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new Quack(), new FlyNoWay());
    }

    public void display() {
        System.out.println("Show robber duck");
    }
}
