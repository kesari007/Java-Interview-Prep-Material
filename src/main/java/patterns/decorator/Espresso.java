package patterns.decorator;

public class Espresso extends Beverage {

    Espresso(){
        beverageName = "Espresso";
    }
    public int getBeveragePrice(){
        return 10;
    }
}
