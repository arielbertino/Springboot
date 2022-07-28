package com.demoWeb2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoWeb2.model.Persona;
import com.demoWeb2.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	// Interface para la parte de seguridad de la aplicacion
}
