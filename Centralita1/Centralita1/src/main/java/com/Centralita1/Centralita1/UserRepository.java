package com.Centralita1.Centralita1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	  List<User> findByNombre(String nombre);

	}