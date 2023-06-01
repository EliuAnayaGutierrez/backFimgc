package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.Expediente;

@Repository
public interface IExpedienteRepository extends JpaRepository<Expediente, Long>{
	
	 public Expediente findExpedienteByNroExpediente(Long id);
	 public Expediente findExpedienteByEstado(Long id);
}
