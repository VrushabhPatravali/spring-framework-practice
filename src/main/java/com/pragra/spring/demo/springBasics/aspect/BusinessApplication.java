package com.pragra.spring.demo.springBasics.aspect;

import com.pragra.spring.demo.springBasics.aspect.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusinessApplication implements CommandLineRunner {
    @Autowired
    BusinessService businessService;
    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(businessService.getMaxValue());
    }
}
