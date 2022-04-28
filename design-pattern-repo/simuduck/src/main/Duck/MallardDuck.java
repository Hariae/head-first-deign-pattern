package main.Duck;

import main.Behaviors.FlyWithWings;
import main.Behaviors.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display...");
    }
}
