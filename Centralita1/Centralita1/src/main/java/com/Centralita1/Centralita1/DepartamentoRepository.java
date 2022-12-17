package com.Centralita1.Centralita1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {

	  List<Departamento> findByNombre(String nombre);

	}
