package edu.unsch.figmc.services;

import java.util.List;


import edu.unsch.figmc.entities.Constancia;

public interface IConstanciaService {
	List<Constancia> list();
	Constancia register(Constancia entity);
	Constancia update(Constancia entity);
}
