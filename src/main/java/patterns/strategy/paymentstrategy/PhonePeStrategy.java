package patterns.strategy.paymentstrategy;

public class PhonePeStrategy implements PaymentStrategy{

    @Override
    public void pay(){
        System.out.println("Payment by PhonePe");
    }
}
