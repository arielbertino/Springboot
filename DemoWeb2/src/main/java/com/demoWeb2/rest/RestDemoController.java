package com.demoWeb2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoWeb2.model.Persona;
import com.demoWeb2.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	// Ejemplo sencillo de servicios REST
	
	//inyecto dependencia desde el repositorio
	@Autowired
	private IPersonaRepo repo;
	
	// operacion de obtener -- segun la anotacion que tiene (@GetMapping)
 	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	// operacionde insertar siempre segun la anotacion que uno le asocie (en este caso @PostMapping)
	@PostMapping
	public void insertar(@RequestBody Persona persona){
		// @RequestBody hace que la estructura JSON definida para el Post desde Postman
		// sea convertida a un objeto propio de JAVA, en este caso de nuestra clase Persona
		repo.save(persona);
	}
	
	// Anotacion @PutMapping sirve para modificar un resgistro de la base
	// es similar al inserta, solo que varia ligeramens su comportamiento
	// guiado por la clave primaria de la tabla, si no encuentra la clave 
	// primaria actua como insercio comun, por otro lado si la encuentra, 
	// va a modificar ese resitro de la base
	@PutMapping
	public void modificar(@RequestBody Persona persona){
		repo.save(persona);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		// Se neceita captura el valor de id a eliminar desde la url (DeleteMapping(value = "/{id}"))
		// es captura con @PathVariable("id") Integer id
		repo.deleteById(id);
	}
}
