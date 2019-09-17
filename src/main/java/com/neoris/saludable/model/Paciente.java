package com.neoris.saludable.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="pacientes")
public class Paciente{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer dni;
	private String sexo;
	private Date fechaDeNacimiento;
	private String localidad;	
	private String tipoTratamiento;
	private String usuario;
	private String contrasena;
	
	
	public Paciente() {
		super();
	}

	public Paciente(String usuario, String contrasena, Integer id, String nombre, String apellido, Integer dni,
			String sexo, Date fechaDeNacimiento, String localidad, String tipoTratamiento) {
	
		this.usuario= usuario;
		this.contrasena= contrasena;
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.localidad = localidad;
		this.tipoTratamiento = tipoTratamiento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	

	public String getTipoTratamiento() {
		return tipoTratamiento;
	}

	public void setTipoTratamiento(String tipoTratamiento) {
		this.tipoTratamiento = tipoTratamiento;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", sexo="
				+ sexo + ", fechaDeNacimiento=" + fechaDeNacimiento + ", localidad=" + localidad + ", tipoTratamiento="
				+ tipoTratamiento + ", usuario=" + usuario + ", contrasena=" + contrasena + "]";
	}
	
}
