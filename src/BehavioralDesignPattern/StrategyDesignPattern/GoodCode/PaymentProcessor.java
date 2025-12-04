package BehavioralDesignPattern.StrategyDesignPattern.GoodCode;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(int amount){
        paymentStrategy.processPayment(amount);
    }
}
