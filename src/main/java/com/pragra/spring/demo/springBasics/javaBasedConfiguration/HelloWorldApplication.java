package com.pragra.spring.demo.springBasics.javaBasedConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApplication {
    public static void main(String[] args) {

        // annotation based configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        //can not use name as person as the name has been changed to testName
        //System.out.println(context.getBean("person"));
        System.out.println(context.getBean(Person.class)); // object of Person of @Primary method/bean will be returned
        System.out.println(context.getBean("testName"));

    }
}
