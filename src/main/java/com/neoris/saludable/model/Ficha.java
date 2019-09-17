package com.neoris.saludable.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fichas")
public class Ficha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private TipoDeComida tipoDeComida;
	private String comidaPrincipal;
	private String comidaSecundaria;
	private String bebida;
	private String postre;
	private boolean tentacion;
	private boolean tieneHambre;
	private Date fechaYHora;
	@ManyToOne
	@JoinColumn(name="paciente_id")
	private Paciente paciente;
	
	public Ficha() {
		super();
	}
	
	

	public Ficha(Integer id, TipoDeComida tipoDeComida, String comidaPrincipal, String comidaSecundaria, String bebida,
			String postre, boolean tentacion, boolean tieneHambre, Date fechaYHora, Paciente paciente) {
		super();
		this.id = id;
		this.tipoDeComida = tipoDeComida;
		this.comidaPrincipal = comidaPrincipal;
		this.comidaSecundaria = comidaSecundaria;
		this.bebida = bebida;
		this.postre = postre;
		this.tentacion = tentacion;
		this.tieneHambre = tieneHambre;
		this.fechaYHora = fechaYHora;
		this.paciente = paciente;
	}



	public Date getFechaYHora() {
		return fechaYHora;
	}



	public void setFechaYHora(Date fechaYHora) {
		this.fechaYHora = fechaYHora;
	}



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public void setTentacion(boolean tentacion) {
		this.tentacion = tentacion;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoDeComida getTipoDeComida() {
		return tipoDeComida;
	}
	public void setTipoDeComida(TipoDeComida tipoDeComida) {
		this.tipoDeComida = tipoDeComida;
	}
	public String getComidaPrincipal() {
		return comidaPrincipal;
	}
	public void setComidaPrincipal(String comidaPrincipal) {
		this.comidaPrincipal = comidaPrincipal;
	}
	public String getComidaSecundaria() {
		return comidaSecundaria;
	}
	public void setComidaSecundaria(String comidaSecundaria) {
		this.comidaSecundaria = comidaSecundaria;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getPostre() {
		return postre;
	}
	public void setPostre(String postre) {
		this.postre = postre;
	}
	public Boolean getTentacion() {
		return tentacion;
	}
	public void setTentacion(Boolean tentacion) {
		this.tentacion = tentacion;
	}
	public boolean isTieneHambre() {
		return tieneHambre;
	}
	public void setTieneHambre(boolean tieneHambre) {
		this.tieneHambre = tieneHambre;
	}
	@Override
	public String toString() {
		return "Ficha [id=" + id + ", tipoDeComida=" + tipoDeComida + ", comidaPrincipal=" + comidaPrincipal
				+ ", comidaSecundaria=" + comidaSecundaria + ", bebida=" + bebida + ", postre=" + postre
				+ ", tentacion=" + tentacion + ", tieneHambre=" + tieneHambre + "]";
	}
	
	
	
	
}
