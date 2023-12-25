package org.Structural.flyweight;

public class TextEditor {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        FormattedCharacter formattedCharacter1 = new FormattedCharacter(characterFactory.getCharacter('a'), "Red", 12);
        FormattedCharacter formattedCharacter2 = new FormattedCharacter(characterFactory.getCharacter('a'), "Blue", 12);
        formattedCharacter1.print();
        formattedCharacter2.print();

    }
}
