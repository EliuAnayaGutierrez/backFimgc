package edu.unsch.figmc.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.unsch.figmc.entities.Escuela;
import edu.unsch.figmc.entities.PlanEstudios;
import edu.unsch.figmc.repositories.IEscuelaRepository;
import edu.unsch.figmc.repositories.IPlanEstudiosRepository;
import edu.unsch.figmc.services.IPlanEstudiosService;

@Service
public class PlanEstudiosServiceImpl implements IPlanEstudiosService{
	@Autowired
	private IPlanEstudiosRepository planEstudiosRepository;
	
	@Autowired
    private IEscuelaRepository escuelaRepository;

	@Override
	public List<PlanEstudios> list() {
		
		return planEstudiosRepository.findAll();	
	}

	@Override
	public PlanEstudios register(PlanEstudios planEstudios) {
		Long escuelaId = planEstudios.getEscuela().getId();// Acceder al atributo escuelaId directamente
	    Optional<Escuela> escuelaOptional = escuelaRepository.findById(escuelaId);
	    if (escuelaOptional.isEmpty()) {
	    	System.out.println("La escuela no existe");
	        return new PlanEstudios();
	    } else {
	        return planEstudiosRepository.save(planEstudios);
	    }
		
	}

	@Override
	public PlanEstudios update(Long id, PlanEstudios planEstudios) {
		// TODO Auto-generated method stub
		PlanEstudios planEstudiosExistente = planEstudiosRepository.findById(id).orElse(null);
        if (planEstudiosExistente != null) {
        	planEstudiosExistente.setId(planEstudios.getId());
        	planEstudiosExistente.setAnioPlan(planEstudios.getAnioPlan());
        	planEstudiosExistente.setNombrePlan(planEstudios.getNombrePlan());
        	planEstudiosExistente.setC_cocurriculares(planEstudios.getC_cocurriculares());
        	planEstudiosExistente.setC_electivos(planEstudios.getC_electivos());
        	planEstudiosExistente.setC_especialidad(planEstudios.getC_especialidad());
        	planEstudiosExistente.setC_obligatorios(planEstudios.getC_obligatorios());
        	planEstudiosExistente.setC_idiomas(planEstudios.getC_idiomas());
            return planEstudiosRepository.save(planEstudiosExistente);
        }
        return null;
	}

	@Override
	public List<PlanEstudios> obtenerPlanEstudiosPorEscuela(Long escuelaId) {
		// TODO Auto-generated method stub
		return planEstudiosRepository.findByEscuela_Id(escuelaId);
	}

}
