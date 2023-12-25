package org.Structural.flyweight;

public class FormattedCharacter {
    private CharacterFlyWeight characterFlyWeight;
    private String color;
    private  int fontSize;

    public FormattedCharacter(CharacterFlyWeight characterFlyWeight, String color, int fontSize) {
        this.characterFlyWeight = characterFlyWeight;
        this.color = color;
        this.fontSize = fontSize;
    }
    public void print() {
        System.out.println("Character: " + characterFlyWeight.getCharacter() + " Color: " + color + " Font Size: " + fontSize);
    }
}
