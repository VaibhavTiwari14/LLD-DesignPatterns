package BehavioralDesignPattern.StrategyDesignPattern.BadCode;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void processPayment(int amount) {
        System.out.println("Processing payment of amt: "+ amount + " via " + this.getClass().getName());
    }
}
