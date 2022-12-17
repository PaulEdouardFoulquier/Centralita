package com.Centralita1.Centralita1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
 	private Long id;
	private String nombre;
	@OneToMany(mappedBy="rol",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	 List<User> users;
	//Create stampe
	//Updated
	/**
	 * @param nombre
	 * @param users
	 */
	public Rol(String nombre, List<User> users) {
		super();
		this.nombre = nombre;
		this.users = users;
	}
	public Rol() {

		this.nombre ="";
		this.users = new ArrayList<User>();
	}

	
	public void adUser(User user) {
		this.users.add(user);
		
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Rol [id=" + id + ", nombre=" + nombre + ", users=" + users + "]";
	}
	
	
	
}
