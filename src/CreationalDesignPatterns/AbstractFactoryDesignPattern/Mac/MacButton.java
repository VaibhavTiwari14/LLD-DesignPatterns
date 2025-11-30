package CreationalDesignPatterns.AbstractFactoryDesignPattern.Mac;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Button;

class MacButton implements Button {
    public void onClick() {
        System.out.println("Mac Button Clicked");
    }

    public void render() {
        System.out.println("Mac Button rendered");
    }
}
