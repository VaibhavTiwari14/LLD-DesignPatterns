package CreationalDesignPatterns.AbstractFactoryDesignPattern.GoodCode;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Button;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Checkbox;

public interface GUIFactory {
    Button constructButton();
    Checkbox constructCheckbox();
}
