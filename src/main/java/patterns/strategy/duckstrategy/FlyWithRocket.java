package patterns.strategy.duckstrategy;

public class FlyWithRocket implements FlyBehaviour{

    @Override
    public void fly(){
        System.out.println("I am flying with rocket");
    }
}
