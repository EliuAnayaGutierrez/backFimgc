package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.Constancia;
import edu.unsch.figmc.entities.Rol;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Long> {

}
