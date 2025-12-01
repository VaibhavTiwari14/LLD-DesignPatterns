package CreationalDesignPatterns.SingletonDesignPattern.GoodCode;

public class Logger {

    // Private constructor prevents object creation from outside
    private Logger() {}

    // Static inner helper class – loaded only when getInstance() is called
    private static class LoggerHelper {
        private static final Logger INSTANCE = new Logger();
    }

    // Global access method
    public static Logger getInstance() {
        return LoggerHelper.INSTANCE;
    }

    public void log(String s) {
        System.out.println("log: " + s);
    }
}
