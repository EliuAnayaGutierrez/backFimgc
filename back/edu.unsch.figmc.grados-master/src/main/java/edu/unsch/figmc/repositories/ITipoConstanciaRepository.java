package edu.unsch.figmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.TipoConstancia;
import edu.unsch.figmc.entities.Usuario;

@Repository
public interface ITipoConstanciaRepository extends JpaRepository<TipoConstancia,Long> {

}
