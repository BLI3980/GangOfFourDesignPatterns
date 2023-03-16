import Behaviors.FlyRocketPowered;
import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();  // By default fly behavior is defined in class as FlyNoWay
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();  // Fly behavior has changed after setting new behavior
        // Note. this would not be possible if implementation of fly was in Duck hierarchy

    }
}
