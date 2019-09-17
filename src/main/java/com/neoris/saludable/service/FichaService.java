package com.neoris.saludable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.saludable.model.Ficha;
import com.neoris.saludable.repository.FichaRepository;

@Service
public class FichaService {
	
	@Autowired
	private FichaRepository fichaRepository;
	
	
	public void insertar(Ficha ficha) {
		
		fichaRepository.save(ficha);
		
		
	}
	
}
