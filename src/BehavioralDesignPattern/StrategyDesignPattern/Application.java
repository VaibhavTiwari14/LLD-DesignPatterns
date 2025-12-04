package BehavioralDesignPattern.StrategyDesignPattern;

import BehavioralDesignPattern.StrategyDesignPattern.GoodCode.CreditCardPayment;
import BehavioralDesignPattern.StrategyDesignPattern.GoodCode.PaymentProcessor;
import BehavioralDesignPattern.StrategyDesignPattern.GoodCode.PaypalPayment;

public class Application {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        paymentProcessor.processPayment(5000);
        paymentProcessor.setPaymentStrategy(new PaypalPayment());
        paymentProcessor.processPayment(4000);
    }
}
