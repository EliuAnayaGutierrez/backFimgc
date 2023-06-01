package edu.unsch.figmc.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.CertificadoEstudios;
import edu.unsch.figmc.repositories.ICertificadoEstudiosRepository;
import edu.unsch.figmc.services.ICertificadoEstudiosService;

@Service
public class CertificadoEstudiosServiceImpl implements ICertificadoEstudiosService{
	@Autowired
    private ICertificadoEstudiosRepository certificadoEstudiosRepository;

	@Override
	public List<CertificadoEstudios> list() {
		
		return certificadoEstudiosRepository.findAll();
	}

	@Override
	public CertificadoEstudios register(CertificadoEstudios entity) {
		
		return certificadoEstudiosRepository.save(entity);
	}

	@Override
	public CertificadoEstudios update(CertificadoEstudios entity) {
		
		return certificadoEstudiosRepository.save(entity);
	} 
}
