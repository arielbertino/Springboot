package com.demoConsola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demoConsola.service.IPersonaService;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	private static Logger logMensajesDeSalida = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	// La siguiente variable es para ejempificar la inyeccionde dependencias 
	@Autowired
	private IPersonaService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Mensaje por systemOut");
		//logMensajesDeSalida.info("Mensaje LOG.INFO");
		//logMensajesDeSalida.warn("Mensaje LOG.WARNING");
		
		// Testeo inyeccion de dependencias
		// funcionamiento:
		// 1ro: El String "Montoto Rolo" viaja a la capa service
		// 2do: La capa service hace como un puente y la direccion a la capa Repo
		// 3re: La capa repo hace la implementacion con la logica que le definí
		
		
		//service = new PersonaServiceImpl();
		// Usando la linea anterior, cuando aumente la cantidad de usuarios que usen la aplicacion
		// Se creará una instacia por cada usuario, haciendolo inviable. 
		// Se tiene que utilizar con patron singleton
		// A la clase que quiero que sea manejada por Spring para que pueda tener una instancia (singleton)
		// le agregamos un estereotipo @Repository en este caso a la clase PersonaRepoImpl
		
		service.registrar("Montoto Rolo");
	}
}
