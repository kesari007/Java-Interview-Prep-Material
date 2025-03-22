package patterns.decorator;

/*
Decorator design pattern :
This is an abstract class, its instance can not be created
 */
public abstract class Beverage {
    String beverageName = "";

    String getBeverageName(){
        return beverageName;
    }
    //abstract because each coffee will have its own implementation aka price
    abstract int getBeveragePrice();
}
