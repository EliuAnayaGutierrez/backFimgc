package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import edu.unsch.figmc.entities.Constancia;

@Repository
public interface IConstanciaRepository extends JpaRepository<Constancia, Long>{

}
