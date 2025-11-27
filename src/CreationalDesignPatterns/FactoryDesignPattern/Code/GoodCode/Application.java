package CreationalDesignPatterns.FactoryDesignPattern.Code.GoodCode;

import CreationalDesignPatterns.FactoryDesignPattern.Notification;

public class Application {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("sms");
        notification.send("Your otp is 1234");
    }
}
