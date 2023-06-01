package edu.unsch.figmc.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.Solicitud;
import edu.unsch.figmc.repositories.ISolicitudRepository;
import edu.unsch.figmc.services.ISolicitudService;

@Service
public class SolicitudServiceImpl implements ISolicitudService {
	@Autowired
    private ISolicitudRepository solicitudRepository;
	@Override
	public List<Solicitud> list() {
	
		return solicitudRepository.findAll() ;
	}

	@Override
	public Solicitud register(Solicitud entity) {
		
		return solicitudRepository.save(entity) ;
	}

	@Override
	public Solicitud update(Solicitud entity) {
		
		return solicitudRepository.save(entity) ;
	}

	@Override
	public void delete(Long id) {
		//1. Buscar la solicitud por id=20
		Solicitud _solicitud=findById(id);
		//2. Enviar la solicitud como parametro para q se elimine
		solicitudRepository.delete(_solicitud);	
	}

	@Override
	public Solicitud findById(Long id) {
		return solicitudRepository.findSolicitudById(id);
	}

}
