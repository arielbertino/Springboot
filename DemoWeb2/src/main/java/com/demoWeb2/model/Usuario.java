package com.demoWeb2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	// Esta clase se encargara luego de almacanar los usuarios y sus claves
	
	@Id
	private int id;
	
	private String nombre;
	private String clave;
	
	public int    getId()     { return id;	}
	public String getNombre() { return nombre; }
	public String getClave()  { return clave; }
	
	public void setId(int id)            { this.id = id; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setClave(String clave)   { this.clave = clave; }
	
}
