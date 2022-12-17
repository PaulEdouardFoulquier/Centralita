package com.Centralita1.Centralita1;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MotivoRepository extends CrudRepository<Motivo, Long> {

	  Optional<Motivo> findById(Long id);

	}