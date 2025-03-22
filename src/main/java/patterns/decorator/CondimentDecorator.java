package patterns.decorator;

public abstract class CondimentDecorator extends Beverage{
    //wrapping the Beverage class
    Beverage beverage;
    public abstract String getBeverageName();
}
