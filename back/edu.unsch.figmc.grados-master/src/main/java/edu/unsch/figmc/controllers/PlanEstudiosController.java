package edu.unsch.figmc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.unsch.figmc.entities.PlanEstudios;
import edu.unsch.figmc.entities.Rol;
import edu.unsch.figmc.services.IPlanEstudiosService;

@RestController
@RequestMapping("/api/plan")
public class PlanEstudiosController {
	@Autowired
	private IPlanEstudiosService planEstudiosService;
	
	@GetMapping
	@CrossOrigin(origins = "http://localhost:5173")
	 public List<PlanEstudios> listarPlanes() {
        return planEstudiosService.list();
    }

    @PostMapping(value = "/registrar", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @CrossOrigin(origins = "http://localhost:5173")
    public PlanEstudios crearPlan(@RequestBody PlanEstudios planEstudios) {
        return planEstudiosService.register(planEstudios);
    }

    
    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public PlanEstudios actualizarPlan (@PathVariable("id") Long id, @RequestBody PlanEstudios planEstudios) {
        return planEstudiosService.update(id, planEstudios);
    }
    
    
    
	

}
