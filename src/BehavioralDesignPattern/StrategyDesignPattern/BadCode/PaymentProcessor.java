package BehavioralDesignPattern.StrategyDesignPattern.BadCode;

import java.util.NoSuchElementException;

public class PaymentProcessor {
    public void processPayment(int amount, String method){
        if (method.contains("credit")){
            CreditCardPayment creditCardPayment = new CreditCardPayment();
            creditCardPayment.processPayment(amount);
        }else if (method.contains("paypal")){
            PaypalPayment paypalPayment = new PaypalPayment();
            paypalPayment.processPayment(amount);
        }else if (method.contains("crypto")){
            CryptoPayment cryptoPayment = new CryptoPayment();
            cryptoPayment.processPayment(amount);
        }else {
            throw new NoSuchElementException("No such payment method available");
        }
    }
}
