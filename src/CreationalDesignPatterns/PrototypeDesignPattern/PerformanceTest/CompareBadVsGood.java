package CreationalDesignPatterns.PrototypeDesignPattern.PerformanceTest;

import CreationalDesignPatterns.PrototypeDesignPattern.BadCode.Character;
import CreationalDesignPatterns.PrototypeDesignPattern.GoodCode.*;

public class CompareBadVsGood {

    public static void main(String[] args) {

        System.out.println("===== BAD CODE TEST (Expensive Constructor Each Time) =====");

        long badStart = System.currentTimeMillis();

        // Create 5 objects using bad implementation
        for (int i = 0; i < 5; i++) {
            Character c = Character.createWithNewName("Player" + i);  // heavy constructor
        }

        long badEnd = System.currentTimeMillis();
        double badSeconds = (badEnd - badStart) / 1000.0;

        System.out.println("Bad Code Total Time (seconds): " + badSeconds);


        System.out.println("\n===== GOOD CODE TEST (Prototype Cloning) =====");

        // Register prototype only ONCE
        CharacterRegistry.register("default",
                new CreationalDesignPatterns.PrototypeDesignPattern.GoodCode.Character(
                        "Adam", 0, 100.0, "Normal", new Inventory("Sword")
                )
        );

        CharacterFactory factory = new CharacterFactory();

        long goodStart = System.currentTimeMillis();

        // Create 5 clones using prototype
        for (int i = 0; i < 5; i++) {
            CreationalDesignPatterns.PrototypeDesignPattern.GoodCode.Character clone =
                    factory.create("default");  // fast clone
        }

        long goodEnd = System.currentTimeMillis();
        double goodSeconds = (goodEnd - goodStart) / 1000.0;

        System.out.println("Good Code Total Time (seconds): " + goodSeconds);


        System.out.println("\n===== RESULT =====");

        System.out.println("Bad Code: " + badSeconds + " sec");
        System.out.println("Good Code: " + goodSeconds + " sec");
        System.out.println("Speed Improvement: " + (badSeconds / goodSeconds) + "x faster!");
    }
}
