package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.CertificadoEstudios;


@Repository
public interface ICertificadoEstudiosRepository extends JpaRepository<CertificadoEstudios, Long>{

}
