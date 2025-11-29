package CreationalDesignPatterns.FactoryDesignPattern.Code.BadCode;

import CreationalDesignPatterns.FactoryDesignPattern.DifferentNotifications.EmailNotification;
import CreationalDesignPatterns.FactoryDesignPattern.DifferentNotifications.PushNotification;
import CreationalDesignPatterns.FactoryDesignPattern.DifferentNotifications.SMSNotification;

// Bad approach - tightly coupled code
public class NotificationService {
    public void sendNotification(String type, String message) {
        switch (type) {
            case "EMAIL" -> {
                EmailNotification email = new EmailNotification();
                email.send(message);
            }
            case "SMS" -> {
                SMSNotification sms = new SMSNotification();
                sms.send(message);
            }
            case "PUSH" -> {
                PushNotification push = new PushNotification();
                push.send(message);
            }
        }
    }
}
