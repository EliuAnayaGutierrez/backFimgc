package edu.unsch.figmc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.unsch.figmc.entities.Rol;
import edu.unsch.figmc.entities.Tramite;
import edu.unsch.figmc.repositories.IRolRepository;
import edu.unsch.figmc.repositories.ITramiteRepository;

public class MyController {
	
	@Autowired
    private IRolRepository rolRepository;
    
    @Autowired
    private ITramiteRepository tramiteRepository;
    
    
}
