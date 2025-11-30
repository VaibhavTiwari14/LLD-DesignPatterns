package CreationalDesignPatterns.AbstractFactoryDesignPattern.BadCode;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Button;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Checkbox;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Mac.MacFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Windows.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        Button button;
        Checkbox checkbox;

        if(os.equalsIgnoreCase("mac")){
            MacFactory factory = MacFactory.getInstance();
            button = factory.constructButton();
            checkbox = factory.constructCheckbox();
        }else{
            WindowsFactory factory = WindowsFactory.getInstance();
            button = factory.constructButton();
            checkbox = factory.constructCheckbox();
        }

        button.render();
        checkbox.render();
    }
}
