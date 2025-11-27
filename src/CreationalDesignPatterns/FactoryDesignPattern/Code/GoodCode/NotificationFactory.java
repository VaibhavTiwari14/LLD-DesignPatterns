package CreationalDesignPatterns.FactoryDesignPattern.Code.GoodCode;

import CreationalDesignPatterns.FactoryDesignPattern.DifferentNotifications.EmailNotification;
import CreationalDesignPatterns.FactoryDesignPattern.DifferentNotifications.PushNotification;
import CreationalDesignPatterns.FactoryDesignPattern.DifferentNotifications.SMSNotification;
import CreationalDesignPatterns.FactoryDesignPattern.Notification;

public class NotificationFactory {
    public static Notification createNotification(String type) throws IllegalArgumentException {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
