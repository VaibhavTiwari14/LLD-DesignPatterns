package CreationalDesignPatterns.AbstractFactoryDesignPattern.Windows;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Checkbox;

class WindowsCheckbox implements Checkbox {
    public void toggle() {
        System.out.println("Windows Check box toggle");
    }

    public void render() {
        System.out.println("Windows Check box render");
    }
}
