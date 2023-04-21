package com.pragra.spring.demo.springBasics.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan
public class CharacterApplication implements CommandLineRunner {
    @Autowired
    CharacterRunner characterRunner;

    public static void main(String[] args) {
        SpringApplication.run(CharacterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        characterRunner.run();
    }
}
