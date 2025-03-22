package patterns.strategy.duckstrategy;

public class Quack implements QuackBehaviour{

    @Override
    public void quack(){
        System.out.println("I can quack bro");
    }
}
