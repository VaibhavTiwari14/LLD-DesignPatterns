package CreationalDesignPatterns.PrototypeDesignPattern.GoodCode;

public class Character implements Cloneable {
    private String name;
    private int level;
    private double health;
    private String walkingStyle;

    private Inventory inventory;

    public Character(String name, int level, double health, String walkingStyle, Inventory inventory){
        this.health = health;
        this.name = name;
        this.level = level;
        this.walkingStyle = walkingStyle;
        this.inventory = inventory;

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public Character clone() {
        try{
            Character newCharacter = (Character) super.clone();
            newCharacter.inventory = inventory.clone();
            return newCharacter;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported",e);
        }
    }

    public void setName(String name) { this.name = name; }
    public void setLevel(int level) { this.level = level; }
    public void setHealth(double health) { this.health = health; }
    public void setWalkingStyle(String walkingStyle) { this.walkingStyle = walkingStyle; }
    public void setInventoryItem(String item) { this.inventory.setItem(item); }

    @Override
    public String toString() {
        return "Character[name=" + name + ", level=" + level
                + ", health=" + health + ", walkingStyle=" + walkingStyle
                + ", " + inventory + "]";
    }
}
