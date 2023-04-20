package com.pragra.spring.demo.springBasics.javaBasedConfigGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
// order of annotations changes order of execution in main
@ComponentScan("com.pragra.spring.demo.springBasics.javaBasedConfigGame")
@ComponentScan("com.pragra.spring.demo.springBasics.game")
public class GameApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameApplication.class);

        context.getBean("mario");
        context.getBean("pacman");
        context.getBean("eat");

        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}


//public class GameApplication {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);
//
//        context.getBean("mario");
//        context.getBean("pacman");
//
//        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//    }
//}
