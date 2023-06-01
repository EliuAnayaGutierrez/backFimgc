package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.Escuela;


@Repository
public interface IEscuelaRepository extends JpaRepository<Escuela,Long>{
	//privacidad resultado findEntidadByColumna(tipoDato parametro)
	public Escuela findEscuelaById(Long id);

}
