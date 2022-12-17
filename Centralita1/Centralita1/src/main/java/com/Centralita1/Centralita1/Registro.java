package com.Centralita1.Centralita1;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
public class Registro {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private LocalDateTime fechaHora;
	private String nombre_persona;
	private String empresa;
	private String observaciones;
	private String contacto_persona;
	@ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.MERGE)
	Motivo motivo;
	@ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.MERGE)
    User empleado;
	@ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.MERGE)
	User atendido;
	
	//Created
	//Updated
	/**
	 * @param fechaHora
	 * @param nombre_persona
	 * @param empresa
	 * @param empleado
	 * @param atendido
	 * @param observaciones
	 * @param contacto_persona
	 * @param motivo
	 */
	public Registro(LocalDateTime fechaHora, String nombre_persona, String empresa, User empleado, User atendido,
			String observaciones, String contacto_persona, Motivo motivo) {
		super();
		this.fechaHora = fechaHora;
		this.nombre_persona = nombre_persona;
		this.empresa = empresa;
		this.empleado = empleado;
		this.atendido = atendido;
		this.observaciones = observaciones;
		this.contacto_persona = contacto_persona;
		this.motivo = motivo;
	}
	public Registro() {
		this.fechaHora = LocalDateTime.now();
		this.nombre_persona = "";
		this.empresa = "";
		this.empleado = new User();
		this.atendido = new User();
		this.observaciones = "";
		this.contacto_persona = "";
		this.motivo = new Motivo();
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
	 * @return the fechaHora
	 */
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	/**
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	/**
	 * @return the nombre_persona
	 */
	public String getNombre_persona() {
		return nombre_persona;
	}
	/**
	 * @param nombre_persona the nombre_persona to set
	 */
	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}
	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	/**
	 * @return the empleado
	 */
	public User getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(User empleado) {
		this.empleado = empleado;
	}
	/**
	 * @return the atendido
	 */
	public User getAtendido() {
		return atendido;
	}
	/**
	 * @param atendido the atendido to set
	 */
	public void setAtendido(User atendido) {
		this.atendido = atendido;
	}
	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}
	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	/**
	 * @return the contacto_persona
	 */
	public String getContacto_persona() {
		return contacto_persona;
	}
	/**
	 * @param contacto_persona the contacto_persona to set
	 */
	public void setContacto_persona(String contacto_persona) {
		this.contacto_persona = contacto_persona;
	}
	/**
	 * @return the motivo
	 */
	public Motivo getMotivo() {
		return motivo;
	}
	/**
	 * @param motivo the motivo to set
	 */
	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}
	@Override
	public String toString() {
		return "Registro [Id=" + Id + ", fechaHora=" + fechaHora + ", nombre_persona=" + nombre_persona + ", empresa="
				+ empresa + ", empleado=" + empleado + ", atendido=" + atendido + ", observaciones=" + observaciones
				+ ", contacto_persona=" + contacto_persona + ", motivo=" + motivo + "]";
	}
	
	
	
	
}
