package com.demoWeb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.demoWeb2.controller.DemoController;
import com.demoWeb2.repo.IPersonaRepo;

@SpringBootApplication
@ComponentScan(basePackageClasses = DemoController.class)
public class DemoWeb2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoWeb2Application.class, args);
	}

}
