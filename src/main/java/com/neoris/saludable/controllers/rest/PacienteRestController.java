package com.neoris.saludable.controllers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.saludable.model.Paciente;
import com.neoris.saludable.service.PacienteService;

@RestController
@RequestMapping(value="/pacientes")
public class PacienteRestController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<Paciente> mostrarPacientes() {
		
		return pacienteService.traerTodos();
		
		
	}
	
	

}
