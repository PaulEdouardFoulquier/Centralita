package com.Centralita1.Centralita1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, Long> {

	  List<Rol> findByNombre(String nombre);

	}