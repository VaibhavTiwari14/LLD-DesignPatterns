package CreationalDesignPatterns.BuilderDesignPattern;

import CreationalDesignPatterns.BuilderDesignPattern.GoodCode.Car;

public class Application2 {
    public static void main(String[] args) {
        Car ferrari = new Car
                .CarBuilder()
                .engine("Nitro")
                .hasNavigationSystem(true)
                .hasSunRoof(false)
                .seats(2)
                .wheels(4)
                .color("Red")
                .build();
    }
}
