package edu.unsch.figmc.services;

import java.util.List;
import java.util.Optional;

import edu.unsch.figmc.entities.Usuario;
import edu.unsch.figmc.entities.Solicitud;

public interface ISolicitudService {
	List<Solicitud> list();
	Solicitud register(Solicitud entity);
	Solicitud update(Solicitud entity);
	void delete(Long id);
	
	Solicitud findById(Long id);
	//ISolicitudService findByService ();
}
