package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.Solicitud;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud,Long>{
	Solicitud findSolicitudById(Long id);
}
