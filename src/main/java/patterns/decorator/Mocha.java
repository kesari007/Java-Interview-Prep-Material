package patterns.decorator;

public class Mocha extends CondimentDecorator{

    Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public String getBeverageName(){
        return beverage.getBeverageName() + " with Mocha";
    }
    public int getBeveragePrice(){
        return beverage.getBeveragePrice() + 1 ;
    }
}
