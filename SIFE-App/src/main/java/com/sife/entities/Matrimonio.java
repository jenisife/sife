package com.sife.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="matrimonio")
@Getter @Setter @NoArgsConstructor
public class Matrimonio {

	@Id
	@Column(name="idmatrimonio")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="matrimonio_seq")
	@SequenceGenerator(name="matrimonio_Seq", sequenceName="incremento")
	private long id;
	
	@Column(name="nombreesposo")
	private String nombreesposo;
	
	@Column(name="nombreesposa")
	private String nombreesposa;
	
	@Column(name="padreesposa")
	private String padreesposa;
	
	@Column(name="madreesposa")
	private String madreesposa;
	
	@Column(name="padreesposo")
	private String padreesposo;
	
	@Column(name="madreesposo")
	private String madreesposo;
	
	@Column(name="testigoesposa")
	private String testigoesposa;
	
	@Column(name="testigoesposo")
	private String testigoesposo;
	
	@Column(name="fedebautismoesposo")
	private long fedebautismoesposo;
	
	@Column(name="fedebautismoesposa")
	private long fedebautismoesposa;
	
	@Column(name="actadeconfirmacionesposo")
	private long actadeconfirmacionesposo;
	
	@Column(name="actadeconfirmacionesposa")
	private long actadeconfirmacionesposa;
	
	@Column(name="actaprimeracomunionesposo")
	private long actaprimeracomunionesposo;
	
	@Column(name="actaprimeracomunioneposa")
	private long actaprimeracomunionesposa;
	
	@Column(name="duiesposo")
	private long duiesposo;
	
	@Column(name="duiesposa")
	private long duiesposa;
	
	@Column(name="fechamatrimonio")
	private String fechamatrimonio;
	
	@Column(name="presbitero")
	private String presbitero;
	
	@Column(name="actamatrimoniocivil")
	private long actamatrimoniocivil;
	
	@Column(name="nombreparroquia")
	private String nombreparroquia;
	
	@Column(name="actamatrimonioreligioso")
	private long actamatrimonioreligioso;
	
	@Column(name="idusuario")
	private long idusuario;
}
