package edu.unsch.figmc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unsch.figmc.entities.Rol;
import edu.unsch.figmc.entities.TipoConstancia;
import edu.unsch.figmc.services.ITipoConstanciaService;

@RestController
@RequestMapping("/api/tipoconstancia")
public class TipoConstanciaController {
	
	@Autowired
	private ITipoConstanciaService tipoconstanciaService;
	
	@GetMapping(value="/list", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TipoConstancia>> list(){
		return new ResponseEntity<List<TipoConstancia>>(tipoconstanciaService.list(),HttpStatus.OK);
	}

}
