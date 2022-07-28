package com.demoWeb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.demoWeb2.controller.DemoController;
import com.demoWeb2.rest.RestDemoController;

@SpringBootApplication
@ComponentScan(basePackageClasses = DemoController.class)
@ComponentScan(basePackageClasses = RestDemoController.class)
public class DemoWeb2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWeb2Application.class, args);
	}

}
