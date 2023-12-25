package org.Structural.flyweight;

public class Character implements CharacterFlyWeight{
    private final char character;

    public Character(char character) {
        this.character = character;
    }
    @Override
    public char getCharacter() {
        return this.character;
    }
}
