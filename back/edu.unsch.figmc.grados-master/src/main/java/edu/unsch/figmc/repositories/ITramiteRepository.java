package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.Escuela;
import edu.unsch.figmc.entities.Tramite;

@Repository
public interface ITramiteRepository extends JpaRepository<Tramite, Long> {
	public Tramite findTramiteById(Long id);
}
