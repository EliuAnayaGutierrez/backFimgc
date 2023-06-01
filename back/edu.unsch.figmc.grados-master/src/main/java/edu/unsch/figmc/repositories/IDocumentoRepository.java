package edu.unsch.figmc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.unsch.figmc.entities.Documento;
import edu.unsch.figmc.entities.Expediente;

@Repository
public interface IDocumentoRepository extends JpaRepository<Documento,Long>{
	public Documento findDocumentoById(Long id); 
	public List<Documento> findDocumentoByExpediente(Expediente expediente);

}
