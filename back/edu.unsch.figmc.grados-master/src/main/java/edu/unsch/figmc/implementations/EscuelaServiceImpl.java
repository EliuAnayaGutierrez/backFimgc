	package edu.unsch.figmc.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.Escuela;
import edu.unsch.figmc.entities.Tramite;
import edu.unsch.figmc.repositories.IEscuelaRepository;
import edu.unsch.figmc.services.IEscuelaService;

@Service
public class EscuelaServiceImpl implements IEscuelaService{
	
	@Autowired
	private IEscuelaRepository escuelaRepository;

	
	@Override
	public List<Escuela> list() {
		
		return escuelaRepository.findAll();
	}
	

	@Override
	public Escuela register(Escuela escuela) {
		// TODO Auto-generated method stub
		return escuelaRepository.save(escuela);
	}

	@Override
	public Escuela update(Long id, Escuela escuela) {
		Escuela escuelaExistente = escuelaRepository.findById(id).orElse(null);
        if (escuelaExistente != null) {
        	escuelaExistente.setNombre(escuela.getNombre());
        	escuelaExistente.setDescripcion(escuela.getDescripcion());
        	escuelaExistente.setDirector(escuela.getDirector());
            return escuelaRepository.save(escuelaExistente);
        }
        return null;
	}
	
	@Override
	public boolean delete(Long id) {
		Escuela escuelaExistente = escuelaRepository.findById(id).orElse(null);
        if (escuelaExistente != null) {
        	escuelaRepository.delete(escuelaExistente);
            return true;
        }
        return false;
    }

	

}
