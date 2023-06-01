package edu.unsch.figmc.services;

import java.util.List;

import edu.unsch.figmc.entities.Tramite;
import edu.unsch.figmc.entities.Tramite;

public interface ITramiteService {
	List<Tramite> listTramite();
	Tramite registerTramite(Tramite tramite);
	Tramite tramiteById(Long id);
	Tramite updateTramite(Long id, Tramite tramite);
	boolean deleteTramite(Long id);
	
	
}
