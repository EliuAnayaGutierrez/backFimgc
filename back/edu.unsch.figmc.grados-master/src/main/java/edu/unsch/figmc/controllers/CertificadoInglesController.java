package edu.unsch.figmc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unsch.figmc.entities.CertificadoIngles;
import edu.unsch.figmc.services.ICertificadoInglesService;

@RestController
@RequestMapping("/api/certificadoingles")
public class CertificadoInglesController {
	@Autowired
	private ICertificadoInglesService certificadoService;
	
	@GetMapping(value="/list", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CertificadoIngles>> list(){
		return new ResponseEntity<List<CertificadoIngles>>(certificadoService.list(),HttpStatus.OK);
	}
}
