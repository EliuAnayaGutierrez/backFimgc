package edu.unsch.figmc.services;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.Documento;
@Service
public interface IDocumentoService {
	List<Documento> list();
	Documento update(Documento entity);
	Documento findDocumentoById(Long id);
	List<Documento> findDocumentoByExpediente(Long id);
}
