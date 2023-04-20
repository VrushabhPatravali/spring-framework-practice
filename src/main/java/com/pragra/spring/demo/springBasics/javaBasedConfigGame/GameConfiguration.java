package com.pragra.spring.demo.springBasics.javaBasedConfigGame;

import com.pragra.spring.demo.springBasics.game.CharacterConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
record Game() {
    @Bean(name="mario")
    public void runMario() {
        System.out.println("mario");
    }
    @Bean(name="pacman")
    public void runPacMan() {
        System.out.println("pacman");
    }
}



//@Configuration
//public class GameConfiguration {
//
//    @Bean(name="mario")
//    public void runMario() {
//        System.out.println("mario");
//    }
//
//    @Bean(name="pacman")
//    public void runPacMan() {
//        System.out.println("pacman");
//    }
//
//}
