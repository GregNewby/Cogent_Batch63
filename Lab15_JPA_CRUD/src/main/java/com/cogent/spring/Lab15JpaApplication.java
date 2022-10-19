package com.cogent.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.spring.controller.ProdController;

@SpringBootApplication
public class Lab15JpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Lab15JpaApplication.class, args);
		ProdController controller= ctx.getBean(ProdController.class);
		controller.Run();
		
	}

}
