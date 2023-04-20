package com.pragra.spring.demo.springBasics.javaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Emily";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean(name="testName")
    public Person person() {
        return new Person("jack", 45);
    }

    @Bean
    @Primary
    public Person newPerson() {
        return new Person(name(), age());
    }

}
