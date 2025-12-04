package BehavioralDesignPattern.StrategyDesignPattern.GoodCode;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void processPayment(int amount) {
        System.out.println("Processing payment of amt: "+ amount + " via " + this.getClass().getName());
    }
}
