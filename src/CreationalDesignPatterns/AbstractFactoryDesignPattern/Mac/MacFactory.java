package CreationalDesignPatterns.AbstractFactoryDesignPattern.Mac;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Button;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Checkbox;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.GoodCode.GUIFactory;

public class MacFactory implements GUIFactory {

    private static MacFactory instance;

    private MacFactory() {}

    public static MacFactory getInstance() {
        if(instance == null) instance = new MacFactory();
        return instance;
    }

    @Override
    public Button constructButton() {
        return new MacButton();
    }

    @Override
    public Checkbox constructCheckbox() {
        return new MacCheckbox();
    }
}
