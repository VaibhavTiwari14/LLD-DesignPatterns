package CreationalDesignPatterns.AbstractFactoryDesignPattern.Mac;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Checkbox;

class MacCheckbox implements Checkbox {
    public void toggle() {
        System.out.println("Mac Check box toggle");
    }

    public void render() {
        System.out.println("Mac Check box render");
    }
}
