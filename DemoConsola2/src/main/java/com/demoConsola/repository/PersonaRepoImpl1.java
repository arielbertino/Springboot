package com.demoConsola.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.demoConsola.DemoConsola2Application;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl1 implements IPersonaRepo{
	
	private static Logger logger = LoggerFactory.getLogger(DemoConsola2Application.class);
	
	@Override
	public void presentar(String nombre, int edad) {
		logger.info("Les presentamos a este increible ser: " + nombre + ", de " + edad + " años");
	}
}
