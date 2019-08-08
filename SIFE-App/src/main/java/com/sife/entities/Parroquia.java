package com.sife.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="parroquia")
@Getter @Setter @NoArgsConstructor
public class Parroquia {
	
	@Id
	@Column(name="nombreparroquia")
	private String parroquia;
	
	@Column(name="departamento")
	private String departamento;
	
	@Column(name="diosesis")
	private String diosesis;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="municipio")
	private String municipio;
	
	@Column(name="parroco")
	private String parroco;
	
	@Column(name="presbitero1")
	private String presbitero1;
	
	@Column(name="presbitero2")
	private String presbitero2;

	@Column(name="telefono")
	private String telefono;
}
