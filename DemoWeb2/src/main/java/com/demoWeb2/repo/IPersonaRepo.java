package com.demoWeb2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoWeb2.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
