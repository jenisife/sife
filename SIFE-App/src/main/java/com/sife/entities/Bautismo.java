package com.sife.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="bautismo")
@Getter @Setter @NoArgsConstructor
public class Bautismo {

	@Id
	@Column(name="Fedebautismo")
	private long fedebautismo;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="fechanacimiento")
	private String fechanacimiento;

	@Column(name="fechasacramento")
	private String fechasacramento;
	
	@Column(name="idusuario")
	private long idusuario;
	
	@Column(name="lugarnacimiento")
	private String lugarnacimiento;
	
	@Column(name="madrina")
	private String madrina;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nombredelamadre")
	private String nombredelamadre;
	
	@Column(name="nombredelpadre")
	private String nombredelpadre;
	
	@Column(name="nombreparroquia")
	private String nombreparroquia;
	
	@Column(name="numpartidanacimiento")
	private long numpartidanacimiento;
	
	@Column(name="padrino")
	private String padrino;
	
	@Column(name="presbitero")
	private String presbitero;
	
	@Column(name="sexo")
	private String sexo;
	
}
