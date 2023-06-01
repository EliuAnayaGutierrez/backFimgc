package edu.unsch.figmc.services;

import java.util.List;

import edu.unsch.figmc.entities.PlanEstudios;

public interface IPlanEstudiosService {

	public abstract List<PlanEstudios> list();
	PlanEstudios register(PlanEstudios entity);
	PlanEstudios update(Long id, PlanEstudios planEstudios);
	List<PlanEstudios> obtenerPlanEstudiosPorEscuela(Long escuelaId);
}
