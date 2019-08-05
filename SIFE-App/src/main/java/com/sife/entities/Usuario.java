package com.sife.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="usuario")
@Getter @Setter @NoArgsConstructor
public class Usuario {

	@Id
	@Column(name="idusuario")
	private long idusuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="cargo")
	private String cargo;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="contraseña")
	private String contraseña;
}
