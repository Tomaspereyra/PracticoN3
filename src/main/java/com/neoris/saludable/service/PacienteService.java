package com.neoris.saludable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neoris.saludable.model.Paciente;
import com.neoris.saludable.repository.PacienteRepository;

public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public void insertar(Paciente p) {
		pacienteRepository.save(p);
	}
	public List<Paciente> traerTodos(){
		return (List<Paciente>) pacienteRepository.findAll();
	}
	
}
