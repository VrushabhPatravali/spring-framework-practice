package com.pragra.spring.demo.springBasics.game;

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
