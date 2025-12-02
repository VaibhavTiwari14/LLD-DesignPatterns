package CreationalDesignPatterns.PrototypeDesignPattern.GoodCode;

public class CharacterFactory {
    public Character create(String key) {
        return CharacterRegistry.getClone(key);
    }
}
