package com.collabera.todoapp;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.testing.Hello;

@SpringBootApplication
@ComponentScan(value = {"com.collabera.todoapp", "com.testing"})
public class TodoAppApplication implements CommandLineRunner{

	@Autowired
	private Hello hello;
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TodoAppApplication.class, args);	
		//hello.display();
		
//		String[] beanNames = context.getBeanDefinitionNames();
//		Arrays.sort(beanNames); //optional
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub	
		 System.out.println("From Display method"); 
		 hello.display();
	}

}
