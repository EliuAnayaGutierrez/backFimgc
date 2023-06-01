package edu.unsch.figmc.services;

import java.util.List;

import edu.unsch.figmc.entities.Escuela;
import edu.unsch.figmc.entities.Rol;

public interface IRolService {
	List<Rol> list();
	Rol register(Rol entity);
	Rol update(Long id, Rol rol);
	void deleteRol(Long id);
}
