package CreationalDesignPatterns.AbstractFactoryDesignPattern.Windows;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Button;

class WindowsButton implements Button {
    public void onClick() {
        System.out.println("Windows Button Clicked");
    }

    public void render() {
        System.out.println("Windows Button rendered");
    }
}
