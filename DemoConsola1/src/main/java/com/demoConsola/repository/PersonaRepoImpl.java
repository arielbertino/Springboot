package com.demoConsola.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.demoConsola.DemoConsolaApplication;

//@Repositori agregado, tambien vamos a una capa mas arriba a PersonaServiceImpl 
// y le agregamos el estereotipo @Service

@Repository
public class PersonaRepoImpl implements IPersonaRepo{
	
	private static Logger logger = LoggerFactory.getLogger(DemoConsolaApplication.class);
		
	
	@Override
	public void registrar(String nombre) {
		logger.info("Se registró exitosamente a " + nombre);
	}
}
