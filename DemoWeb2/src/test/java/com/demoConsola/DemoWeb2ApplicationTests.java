package com.demoConsola;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	
	//Inyacto en encoder que al ser bean solo hay una instacia
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(4);
		us.setNombre("montoto");
		us.setClave(encoder.encode("oto"));
		Usuario retorno = repo.save(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}
}
