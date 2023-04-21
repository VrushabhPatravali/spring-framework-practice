package com.pragra.spring.demo.springBasics.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Lion implements CharacterConsole{

    public void move() {
        System.out.println("lion moves");
    }
    public void attack() {
        System.out.println("lion attacks");
    }
    //@Bean
    public void eat() {
        System.out.println("lion eats");
    }
}
