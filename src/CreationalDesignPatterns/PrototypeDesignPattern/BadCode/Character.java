package CreationalDesignPatterns.PrototypeDesignPattern.BadCode;

public class Character {
    private String name;
    private int level;
    private double health;
    private String walkingStyle;

    public Character(String name, int level, double health, String walkingStyle) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.walkingStyle = walkingStyle;

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static Character temp = new Character("Adam", 0, 100.00, "Normal");

    public static Character createWithNewName(String name){
        return new Character(name, temp.level, temp.health, temp.walkingStyle);
    }

    public static Character createWithNewLevel(int level){
        return new Character(temp.name, level, temp.health, temp.walkingStyle);
    }

    public static Character createWithNewHealth(double health){
        return new Character(temp.name, temp.level, health, temp.walkingStyle);
    }

    public static Character createWithNewWalkingStyle(String walkingStyle){
        return new Character(temp.name, temp.level, temp.health, walkingStyle);
    }
}
