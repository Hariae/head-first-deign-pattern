package main;

import main.Behaviors.FlyBehavior;
import main.Behaviors.FlyRocketPowered;
import main.Duck.Duck;
import main.Duck.MallardDuck;
import main.Duck.RedHeadDuck;
import main.Duck.RubberDuck;

public class Simuduck {
    public static void main(String[] args) {
        System.out.println("Simuduck....");
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        //mallardDuck.fly();
        //mallardDuck.quack();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.display();

        //redheadDuck.fly();
        //redheadDuck.quack();
        redheadDuck.display();

        //rubberDuck.quack();
        rubberDuck.display();
        rubberDuck.performFly();
        FlyBehavior fb = new FlyRocketPowered();
        rubberDuck.setFlyBehavior(fb);
        rubberDuck.performFly();
    }
}
