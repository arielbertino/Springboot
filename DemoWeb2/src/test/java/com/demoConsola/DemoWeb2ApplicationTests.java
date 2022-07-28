package com.demoConsola;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demoWeb2.model.Usuario;
import com.demoWeb2.repo.IUsuarioRepo;


@RunWith(SpringRunner.class)
@SpringBootTest
class DemoWeb2ApplicationTests {
	// En esta clase test, se crea un test unitario simple 
	//para poner en practica conceptos de suguridad basica
	
	// Inyecto la dependencia del reop para poder traer 
	// operaciones de insercion
	@Autowired
	private IUsuarioRepo repo;
	
	@Test
	public void crearUsuarioTest() {
		Usuario user = new Usuario();
		user.setId(1);
		user.setNombre("RoloR");
		user.setClave("1234");
		Usuario usuarioRetorno = repo.save(user);
		assertTrue(usuarioRetorno.getClave().equalsIgnoreCase(user.getClave()));
	}

}
