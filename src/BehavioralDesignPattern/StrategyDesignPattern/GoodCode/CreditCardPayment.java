package BehavioralDesignPattern.StrategyDesignPattern.GoodCode;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(int amount) {
        System.out.println("Processing payment of amt: "+ amount + " via " + this.getClass().getName().substring(this.getClass().getName().indexOf("Credit")));
    }
}
