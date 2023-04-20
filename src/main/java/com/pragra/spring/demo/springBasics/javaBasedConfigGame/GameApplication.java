package com.pragra.spring.demo.springBasics.javaBasedConfigGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        context.getBean("mario");
        context.getBean("pacman");
    }
}
