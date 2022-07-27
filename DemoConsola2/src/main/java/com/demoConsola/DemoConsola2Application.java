package com.demoConsola;

import org.springframework.beans.factory.annotation.Autowired;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demoConsola.service.IPersonaService;

@SpringBootApplication
public class DemoConsola2Application implements CommandLineRunner{
	
	// Por si quiero mostrar algun log
	// private static Logger logger = LoggerFactory.getLogger(DemoConsola2Application.class);
	
	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsola2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		 service.presentar("Rulfo", 1000);
	}
	
	

}
