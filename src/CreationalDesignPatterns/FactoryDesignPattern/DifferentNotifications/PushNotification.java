package CreationalDesignPatterns.FactoryDesignPattern.DifferentNotifications;

import CreationalDesignPatterns.FactoryDesignPattern.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}
