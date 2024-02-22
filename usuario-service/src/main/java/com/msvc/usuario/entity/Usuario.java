package com.msvc.usuario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios" )
public class Usuario {
	@Id
	@Column(name="id")
	private String usuarioId;
	@Column(name="nombre", length=20)
	private String nombre;
	@Column(name="emal")
	private String email;
	@Column(name="informacion")
	private String informacion;
	
	public Usuario(String usuarioId, String nombre, String email, String informacion) {
		super();
		this.usuarioId = usuarioId;
		this.nombre = nombre;
		this.email = email;
		this.informacion = informacion;
	}

	public Usuario() {
		super();
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	
	

	
}
