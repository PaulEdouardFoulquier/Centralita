package com.Centralita1.Centralita1;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RegistroRepository extends CrudRepository<Registro, Long> {

	  Optional<Registro> findById(Long id);

	}