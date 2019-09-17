package com.neoris.saludable.controllers.rest;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.neoris.saludable.model.Paciente;
import com.neoris.saludable.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin(origins = "http://localhost:4200") //  the annotation enables Cross-Origin Resource Sharing (CORS) on the server.
public class PacienteRestController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<Paciente> mostrarPacientes() {	
		return pacienteService.traerTodos();		
		
	}
	@PostMapping("/insertar")
	public void insertar(@RequestBody Paciente p) {		
		pacienteService.insertar(p);
		
	}
	
	@GetMapping("/traer")
	public Optional<Paciente> traer() {
	return pacienteService.traerPorId(1);	
	}
	
	@GetMapping("/todos")
	public List<Paciente> traerTodos(){
		return pacienteService.traerTodos();
	}
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody String data) {
		Gson gson = new Gson();
		Paciente p = gson.fromJson(data, Paciente.class);
		ResponseEntity response = null;
		try {
			p = pacienteService.traerPorUsuarioYcontrasena(p.getUsuario(),p.getContrasena()).get();
			response = new ResponseEntity(p, HttpStatus.OK);

		}catch(NoSuchElementException  e) {
			response = new ResponseEntity<String>("Usuario o contraseña incorrecto",HttpStatus.EXPECTATION_FAILED);
			
		}
		
		
		return  response;
		
	
	}
	
	
	

}
