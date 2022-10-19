package com.cogent.spring;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.spring.bean.Product02;
import com.cogent.spring.controller.ProdController;

@SpringBootApplication
public class Lab14JpaCrudApplication {

	private static final String LocalDate = null;

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Lab14JpaCrudApplication.class, args);
		ProdController controller= ctx.getBean(ProdController.class);
		controller.run();
	}

}
