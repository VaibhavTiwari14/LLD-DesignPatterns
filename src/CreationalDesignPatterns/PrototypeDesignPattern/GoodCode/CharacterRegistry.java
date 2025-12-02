package CreationalDesignPatterns.PrototypeDesignPattern.GoodCode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CharacterRegistry {
    private static final Map<String, Character> REGISTER = new ConcurrentHashMap<>();

    public static void register(String key, Character ch){
        REGISTER.put(key,ch);
    }

    public static Character getClone(String key){
        Character prototype = REGISTER.get(key);
        if(prototype == null){
            throw new IllegalArgumentException("No prototype registered with key: " + key);
        }
        return prototype.clone();
    }

}
