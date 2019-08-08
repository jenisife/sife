package com.sife.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="bautismo")
@Getter @Setter @NoArgsConstructor
public class Bautismo {

	@Id
	@Column(name="febautismo")
	private long febautismo;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Usuario id;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parroquia", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Parroquia parroquia;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="fechanacimiento")
	private String fechanacimiento;

	@Column(name="fechasacramento")
	private String fechasacramento;
	
	
	@Column(name="lugarnacimiento")
	private String lugarnacimiento;
	
	@Column(name="madrina")
	private String madrina;
	
	
	
	@Column(name="nombremadre")
	private String nombremadre;
	
	@Column(name="nombrepadre")
	private String nombrepadre;
	
	
	@Column(name="partidanacimiento")
	private long partidanacimiento;
	
	@Column(name="padrino")
	private String padrino;
	
	@Column(name="presbitero")
	private String presbitero;
	
	@Column(name="sexo")
	private String sexo;
	
}
