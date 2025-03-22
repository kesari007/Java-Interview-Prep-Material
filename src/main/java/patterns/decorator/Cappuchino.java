package patterns.decorator;

public class Cappuchino extends Beverage{

    Cappuchino(){
        beverageName = "Cappuchino";
    }

    public int getBeveragePrice(){
        return 12 ;
    }
}
