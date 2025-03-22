package patterns.strategy.paymentstrategy;

public class GooglePayStrategy implements PaymentStrategy{

    @Override
    public void pay(){
        System.out.println("Payment by Gpay");
    }
}
