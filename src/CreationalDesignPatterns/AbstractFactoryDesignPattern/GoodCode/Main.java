package CreationalDesignPatterns.AbstractFactoryDesignPattern.GoodCode;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Button;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Checkbox;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Mac.MacFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Windows.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = System.getProperty("os.name");
        System.out.println(System.getProperty("os.name"));

        factory = switch (os.toLowerCase()) {
            case String s when s.contains("mac") -> MacFactory.getInstance();
            case String s when s.contains("windows") -> WindowsFactory.getInstance();
            default -> throw new IllegalStateException("Unsupported OS: " + os);
        };

        Button button = factory.constructButton();
        Checkbox checkbox = factory.constructCheckbox();

        button.render();
        checkbox.render();
    }
}
