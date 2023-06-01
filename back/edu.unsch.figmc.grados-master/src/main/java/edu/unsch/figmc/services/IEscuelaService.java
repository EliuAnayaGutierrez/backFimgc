package edu.unsch.figmc.services;

import java.util.List;

import edu.unsch.figmc.entities.Escuela;

import org.springframework.stereotype.Service;

@Service
public interface IEscuelaService {
	List<Escuela> list();

	Escuela register(Escuela entity);
	Escuela update(Long id, Escuela escuela);
	boolean delete(Long id);
	
}
