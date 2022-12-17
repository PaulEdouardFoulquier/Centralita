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
public class Departamento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String telefono;
	@OneToMany(mappedBy="departamento",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	 List<User> users;
	//Created
	//Updated
	/**
	 * @param id
	 * @param nombre
	 * @param telefono
	 * @param users
	 */
	public Departamento(String nombre, String telefono, List<User> users) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.users = users;
	}
	public Departamento() {
		this.nombre = "";
		this.telefono = "";
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
		return "Departamento [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", users=" + users + "]";
	}
	

	
	
}
