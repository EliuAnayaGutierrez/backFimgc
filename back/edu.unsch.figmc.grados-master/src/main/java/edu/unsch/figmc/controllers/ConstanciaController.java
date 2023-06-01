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

import edu.unsch.figmc.entities.Constancia;
import edu.unsch.figmc.entities.Solicitud;
import edu.unsch.figmc.services.IConstanciaService;



@RestController
@RequestMapping("/api/constancia")

public class ConstanciaController {
	@Autowired
	private IConstanciaService constanciaService;
	
	@GetMapping(value="/list", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Constancia>> list(){
		return new ResponseEntity<List<Constancia>>(constanciaService.list(),HttpStatus.OK);
	}
	@PostMapping(value="/register", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Constancia> register(@RequestBody Constancia entity ){
		return new ResponseEntity<Constancia>(constanciaService.register(entity),HttpStatus.OK);
	}
	
	@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Constancia> update(@RequestBody Constancia entity ){
		return new ResponseEntity<Constancia>(constanciaService.update(entity),HttpStatus.OK);
	}
}
