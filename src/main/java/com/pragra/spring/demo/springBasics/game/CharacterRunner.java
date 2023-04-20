package com.pragra.spring.demo.springBasics.game;

public class CharacterRunner {

    private CharacterConsole character;
    public CharacterRunner(CharacterConsole character) {

        this.character = character;
    }

    public void run() {
        character.attack();
        character.move();
        character.eat();
    }
}
