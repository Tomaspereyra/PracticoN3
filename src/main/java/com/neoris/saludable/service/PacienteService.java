package com.neoris.saludable.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.saludable.model.Paciente;
import com.neoris.saludable.repository.PacienteRepository;
@Service("pacienteService")
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public void insertar(Paciente p) {
		pacienteRepository.save(p);
	}
	public List<Paciente> traerTodos(){
		return (List<Paciente>) pacienteRepository.findAll();
	}
	
	public Optional<Paciente> traerPorId(int id) {
		return pacienteRepository.findById(id);
	}
	
	public Optional<Paciente> traerPorUsuarioYcontrasena(String usuario,String contrasena){
		return pacienteRepository.findByUsuarioAndContrasena(usuario,contrasena);
	}
	
	
}
