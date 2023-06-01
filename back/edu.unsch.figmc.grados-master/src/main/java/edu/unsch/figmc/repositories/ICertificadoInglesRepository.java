package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.CertificadoIngles;

@Repository
public interface ICertificadoInglesRepository extends JpaRepository<CertificadoIngles, Long>{

	
}
