package com.pragra.spring.demo.springBasics.game;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CharacterRunner {

    @Autowired
    @Qualifier("eagle")
    private CharacterConsole character;

//    public CharacterRunner(@Qualifier("elephant") CharacterConsole character) {
//        this.character = character;
//    }

    public void run() {
        character.attack();
        character.move();
        character.eat();
    }

    @PostConstruct
    public void init() {
        System.out.println("in init method");
        //...initialize variables etc.
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("in clean up method");
    }
}
