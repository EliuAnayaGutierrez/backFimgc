package edu.unsch.figmc.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.Constancia;
import edu.unsch.figmc.repositories.IConstanciaRepository;
import edu.unsch.figmc.services.IConstanciaService;

@Service
public class ConstanciaServiceImpl implements IConstanciaService {
	@Autowired
	private IConstanciaRepository constanciaRepository ;

	@Override
	public List<Constancia> list() {
		
		return constanciaRepository.findAll();
	}

	@Override
	public Constancia register(Constancia entity) {
		
		return constanciaRepository.save(entity);
	}

	@Override
	public Constancia update(Constancia entity) {
		
		return constanciaRepository.save(entity);
	}

}
