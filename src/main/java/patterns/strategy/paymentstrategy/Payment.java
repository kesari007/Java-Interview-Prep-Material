package patterns.strategy.paymentstrategy;

public class Payment {
    private final PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        paymentStrategy.pay();
    }
}
