package Behaviors;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Behaviors.Quack");
    }
}
