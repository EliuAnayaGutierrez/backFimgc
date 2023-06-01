package edu.unsch.figmc.implementations;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.unsch.figmc.entities.Documento;
import edu.unsch.figmc.entities.Expediente;
import edu.unsch.figmc.repositories.IDocumentoRepository;
import edu.unsch.figmc.repositories.IEscuelaRepository;
import edu.unsch.figmc.services.IDocumentoService;
@Service
public class DocumentoServiceImpl implements IDocumentoService {
	@Autowired
	private IDocumentoRepository documentoRepository;
	@Autowired
	//private IExpedienteRepository escuelaRepository;
	
	@Override
	public List<Documento> list() {
		return documentoRepository.findAll();
	}

	@Override
	public Documento update(Documento entity) {
		// TODO Auto-generated method stub
		return documentoRepository.save(entity);
	}

	@Override
	public Documento findDocumentoById(Long id) {
		// TODO Auto-generated method stub
		return documentoRepository.findDocumentoById(id);
	}

	@Override
	public List<Documento> findDocumentoByExpediente(Long id) {
		// TODO Auto-generated method stub
		//Expediente expediente=expedienteRepository.find(id);
		return null;
	}

}
