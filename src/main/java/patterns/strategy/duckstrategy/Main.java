package patterns.strategy.duckstrategy;

public class Main {

    public static void main(String[] args){
        Duck firstDuck = new DuckA(new FlyWithRocket(), new Quack());

        firstDuck.performFly();
        firstDuck.performQuack();
    }
}
