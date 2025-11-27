package CreationalDesignPatterns.FactoryDesignPattern.Code.BadCode;

public class Application {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("email", "Hello");
    }
}
