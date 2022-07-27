package com.demoConsola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoConsola.repository.IPersonaRepo;

// Luego de agregar @Service, agrego @Autowired a la variable privada de esta clase (en este caso), o a la que se necesite.

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	
	@Autowired
	private IPersonaRepo repositorio;
	
	@Override
	public void registrar(String nombre) {
		
		repositorio.registrar(nombre);
		
	}
}
