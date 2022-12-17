package com.Centralita1.Centralita1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class User {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
  	private Long id;
	private String nombre;
	private String contraseña;
	private String email;
	private String DNI;
  	@ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.MERGE)
	Departamento departamento;
 	@ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.MERGE)
	Rol rol;
 	@OneToMany(mappedBy="empleado",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	List<Registro> empleado;
	@OneToMany(mappedBy="atendido",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	List<Registro> atendido;
	/**
	 * @param nombre
	 * @param contraseña
	 * @param email
	 * @param dNI
	 * @param departamento
	 * @param rol
	 * @param empleado
	 * @param atendido
	 */
	public User(String nombre, String contraseña, String email, String dNI, Departamento departamento, Rol rol,
			List<Registro> empleado, List<Registro> atendido) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.email = email;
		DNI = dNI;
		this.departamento = departamento;
		this.rol = rol;
		this.empleado = empleado;
		this.atendido = atendido;
	}
	public User() {
		this.nombre = "";
		this.contraseña = "";
		this.email = "";
		DNI = "";
		this.departamento = new Departamento();
		this.rol = new Rol();
		this.empleado = new ArrayList<Registro>();
		this.atendido = new ArrayList<Registro>();
	}
	public void addRegistroEmpleado(Registro registro) {
		this.empleado.add(registro);
	}
	public void addRegistroAtendido(Registro registro) {
		this.atendido.add(registro);
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
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}
	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	/**
	 * @return the empleado
	 */
	public List<Registro> getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(List<Registro> empleado) {
		this.empleado = empleado;
	}
	/**
	 * @return the atendido
	 */
	public List<Registro> getAtendido() {
		return atendido;
	}
	/**
	 * @param atendido the atendido to set
	 */
	public void setAtendido(List<Registro> atendido) {
		this.atendido = atendido;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", contraseña=" + contraseña + ", email=" + email + ", DNI="
				+ DNI + ", departamento=" + departamento + ", rol=" + rol + ", empleado=" + empleado + ", atendido="
				+ atendido + "]";
	}


	
	
	
	
	
}
