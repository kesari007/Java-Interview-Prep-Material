package patterns.strategy.paymentstrategy;

public class Main {
    public static void main(String[] args){
        Payment pay = new Payment(new GooglePayStrategy());
        pay.pay();
    }
}
