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
@Table(name="confirmacion")
@Getter @Setter @NoArgsConstructor
public class Confirmacion {
	
	@Id
	@Column(name="actaconfirmacion")
	private long confirmacion;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parroquia", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Parroquia parroquia;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="bautismo", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Parroquia febautismo;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuario", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Usuario id;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="comunion", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private PrimeraComunion actacomunion;
	
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
	
	@Column(name="nombrepadre")
	private String nombrepadre;
	
	@Column(name="nombreamadre")
	private String nombreamadre;
	
	@Column(name="padrino")
	private String padrino;
	
	@Column(name="madrina")
	private String madrina;
	
	@Column(name="presbitero")
	private String presbitero;
	
	@Column(name="obispo")
	private String obispo;
	
	@Column(name="fechasacramento")
	private String fechasacramento;
		
	@Column(name="actaprimeracomunion")
	private long actaprimeracomunion;
	
}
