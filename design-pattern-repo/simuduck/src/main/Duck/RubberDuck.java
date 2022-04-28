package main.Duck;

import main.Behaviors.FlyNoWay;
import main.Behaviors.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();

    }
    @Override
    public void display() {
        System.out.println("Rubberduck display...");
    }


}
