package com.neoris.saludable.repository;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.neoris.saludable.model.Paciente;


public interface PacienteRepository extends CrudRepository<Paciente,Integer>{

		public Optional<Paciente> findByUsuarioAndContrasena(String usuario,String contrasena);
}
