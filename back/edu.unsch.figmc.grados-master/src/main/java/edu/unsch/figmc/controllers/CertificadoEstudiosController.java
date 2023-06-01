package edu.unsch.figmc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unsch.figmc.entities.CertificadoEstudios;
import edu.unsch.figmc.entities.Solicitud;
import edu.unsch.figmc.services.ICertificadoEstudiosService;

@RestController
@RequestMapping("/api/certificadoestudios")
public class CertificadoEstudiosController {
	
	@Autowired
	private ICertificadoEstudiosService certificadoestudiosService; 
	
	@GetMapping(value="/list", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CertificadoEstudios>> list(){
		return new ResponseEntity<List<CertificadoEstudios>>(certificadoestudiosService.list(),HttpStatus.OK);
	}
	@PostMapping(value="/register", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CertificadoEstudios> register(@RequestBody CertificadoEstudios entity ){
		return new ResponseEntity<CertificadoEstudios>(certificadoestudiosService.register(entity),HttpStatus.OK);
	}
	@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CertificadoEstudios> update(@RequestBody CertificadoEstudios entity ){
		return new ResponseEntity<CertificadoEstudios>(certificadoestudiosService.update(entity),HttpStatus.OK);
	}
}


