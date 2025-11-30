package CreationalDesignPatterns.AbstractFactoryDesignPattern.Windows;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Button;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Checkbox;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.GoodCode.GUIFactory;

public class WindowsFactory implements GUIFactory {
    private static WindowsFactory instance;

    private WindowsFactory(){}

    public static WindowsFactory getInstance(){
        if(instance == null) return new WindowsFactory();
        return instance;
    }

    public Button constructButton() {
        return new WindowsButton();
    }

    public Checkbox constructCheckbox() {
        return new WindowsCheckbox();
    }
}
