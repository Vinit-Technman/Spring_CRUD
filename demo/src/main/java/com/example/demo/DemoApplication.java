package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class DemoApplication{
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("scratch.xml");
		Student s=(Student) context.getBean("student1");
		System.out.println(s);
		System.out.println("Hello World");

	}

}
