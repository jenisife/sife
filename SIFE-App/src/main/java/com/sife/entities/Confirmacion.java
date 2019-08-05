package com.sife.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="confirmacion")
@Getter @Setter @NoArgsConstructor
public class Confirmacion {

	@Column(name="actadeconfirmacion")
	private long actadeconfirmacion;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="lugarnacimiento")
	private String lugarnacimiento;
	
	@Column(name="fechanacimiento")
	private String fechanacimiento;
	
	@Column(name="nombredelpadre")
	private String nombredelpadre;
	
	@Column(name="nombredelamadre")
	private String nombredelamadre;
	
	@Column(name="padrino")
	private String padrino;
	
	@Column(name="madrina")
	private String madrina;
	
	@Column(name="nombreparroquia")
	private String nombreparroquia;
	
	@Column(name="presbitero")
	private String presbitero;
	
	@Column(name="obispo")
	private String obispo;
	
	@Column(name="fechasacramento")
	private String fechasacramento;
	
	@Column(name="fedebautismo")
	private long fedebautismo;
	
	@Column(name="actaprimeracomunion")
	private long actaprimeracomunion;
	
	@Column(name="idusuario")
	private String idusuario;	
}
