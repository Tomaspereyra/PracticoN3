package com.neoris.saludable.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.saludable.model.Ficha;
import com.neoris.saludable.service.FichaService;
import com.neoris.saludable.service.PacienteService;

@RestController
@RequestMapping("/ingresarFicha")
@CrossOrigin(origins = "http://localhost:4200") //  the annotation enables Cross-Origin Resource Sharing (CORS) on the server.
public class FichaRestController {
	
	@Autowired
	private FichaService fichaService;
	
	@Autowired
	private PacienteService pacienteService;

	
	@PostMapping
	public ResponseEntity<String> ingresar(@RequestBody Ficha f) {
		System.out.println(f);
		fichaService.insertar(f);
		return new ResponseEntity("Ingresado correctamente",HttpStatus.OK);
	}

}
