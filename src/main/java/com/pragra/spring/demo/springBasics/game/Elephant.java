package com.pragra.spring.demo.springBasics.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Elephant implements CharacterConsole {

    public void move() {
        System.out.println("elephant moves");
    }

    public void attack() {
        System.out.println("elephant attacks");
    }

    public void eat() {
        System.out.println("elephant eats");
    }

}
