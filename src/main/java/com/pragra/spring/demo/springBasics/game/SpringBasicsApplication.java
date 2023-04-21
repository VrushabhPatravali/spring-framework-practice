package com.pragra.spring.demo.springBasics.game;

import com.pragra.spring.demo.springBasics.game.CharacterRunner;
import com.pragra.spring.demo.springBasics.game.Eagle;
import com.pragra.spring.demo.springBasics.game.Elephant;
import com.pragra.spring.demo.springBasics.game.Lion;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class SpringBasicsApplication {
	public static void main(String[] args) {

		//SpringApplication.run(SpringBasicsApplication.class, args);

//		Elephant elephant = new Elephant();
//		Eagle eagle = new Eagle();
//		Lion lion = new Lion();
//
//		CharacterRunner characterRunner = new CharacterRunner(eagle);
//		characterRunner.run();

		// xml based configuration
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		System.out.println(context.getBean("elephant"));
//		System.out.println(context.getBean("characterRunner1"));
//		System.out.println(context.getBean("characterRunner2"));
//		System.out.println(context.getBean("eagle"));
//		System.out.println(context.getBean("lion"));
//
//		CharacterRunner runner1 = (CharacterRunner) context.getBean("characterRunner1");
//		runner1.run();

	}

}
