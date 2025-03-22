package patterns.strategy.duckstrategy;

public class DuckA extends Duck{

    public DuckA(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }
    public void display() {
        System.out.println("This is Duck A");
    }
}
