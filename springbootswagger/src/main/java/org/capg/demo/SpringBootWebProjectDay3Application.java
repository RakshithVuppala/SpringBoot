package org.capg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("org.capg")
@EnableSwagger2
public class SpringBootWebProjectDay3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebProjectDay3Application.class, args);
		
	}

}
