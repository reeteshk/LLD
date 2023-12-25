package org.Structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<java.lang.Character, CharacterFlyWeight> characterMap = new HashMap<>();

    public CharacterFlyWeight getCharacter(char character) {
        CharacterFlyWeight characterFlyWeight = characterMap.get(character);
        if (characterFlyWeight == null) {
            characterFlyWeight = new Character(character);
            characterMap.put(character, characterFlyWeight);
        }
        return characterFlyWeight;
    }
}
