package com.idat.EC1Nolasco.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Table(name="malla")
@Entity
public class MallaCurricular {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private String anio;
	
	@OneToOne
	@JoinColumn(name="id_universidad",
	nullable=false,
	unique=true,
	foreignKey=@ForeignKey(foreignKeyDefinition = "foreign key (id_universidad) references universidad(id_universidad)")
			)
	private Universidad universidad;
	
	@OneToMany(mappedBy ="malla")
	private List<Curso> curso=new ArrayList<>();
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
}
