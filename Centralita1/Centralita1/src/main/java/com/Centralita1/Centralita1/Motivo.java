package com.Centralita1.Centralita1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity
public class Motivo {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String descripcion;
	@OneToMany(mappedBy="motivo",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	 List<Registro> registros;
	/**
	 * @param descripcion
	 * @param registros
	 */
	public Motivo(String descripcion, List<Registro> registros) {
		super();
		this.descripcion = descripcion;
		this.registros = registros;
	}
	public Motivo() {
		
		this.descripcion = "";
		this.registros = new ArrayList<Registro>();
	
	}
	public void addRegistro(Registro registro) {
		this.registros.add(registro);
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the registros
	 */
	public List<Registro> getRegistros() {
		return registros;
	}
	/**
	 * @param registros the registros to set
	 */
	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	@Override
	public String toString() {
		return "Motivo [Id=" + Id + ", descripcion=" + descripcion + ", registros=" + registros + "]";
	}
	
	
	
}
