package edu.unsch.figmc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.unsch.figmc.entities.Solicitud;
import edu.unsch.figmc.services.ISolicitudService;

@RestController
@RequestMapping("/api/solicitud")
public class SolicitudController {
	
	@Autowired
	private ISolicitudService solicitudService;
	
	@GetMapping(value="/list", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Solicitud>> list(){
		return new ResponseEntity<List<Solicitud>>(solicitudService.list(),HttpStatus.OK);
	}
	
	@PostMapping(value="/register", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Solicitud> register(@RequestBody Solicitud entity ){
		return new ResponseEntity<Solicitud>(solicitudService.register(entity),HttpStatus.OK);
	}
	
	@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Solicitud> update(@RequestBody Solicitud entity ){
		return new ResponseEntity<Solicitud>(solicitudService.update(entity),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable("id") Long id){		
//		id=20
		solicitudService.delete(id);		
//		localhost:8080/api/solicitud/delete/20
	}
}
