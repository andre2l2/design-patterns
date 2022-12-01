package strategy.ducksBehavior;

import strategy.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Duck sound Squeak");
    }
}
