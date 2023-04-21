package com.pragra.spring.demo.springBasics.game;


import org.springframework.stereotype.Component;

@Component
public class Eagle implements CharacterConsole{

    public void move() {
        System.out.println("eagle moves");
    }

    public void attack() {
        System.out.println("eagle attacks");
    }
    public void eat() {
        System.out.println("eagle eats");
    }
}
