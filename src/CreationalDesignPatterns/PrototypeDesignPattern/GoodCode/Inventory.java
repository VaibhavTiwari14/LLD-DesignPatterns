package CreationalDesignPatterns.PrototypeDesignPattern.GoodCode;

public class Inventory implements Cloneable{
    private String item;

    public Inventory(String item){
        this.item = item;
    }

    @Override
    public Inventory clone(){
        try{
            return (Inventory) super.clone();
        }catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void setItem(String newItem){
        this.item = newItem;
    }

    @Override
    public String toString() {
        return "Inventory[item=" + item + "]";
    }
}
