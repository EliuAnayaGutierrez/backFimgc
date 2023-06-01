package edu.unsch.figmc.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.TipoConstancia;
import edu.unsch.figmc.repositories.ISolicitudRepository;
import edu.unsch.figmc.repositories.ITipoConstanciaRepository;
import edu.unsch.figmc.services.ITipoConstanciaService;
import edu.unsch.figmc.services.IUsuarioService;
@Service
public class TipoConstanciaServiceImpl implements ITipoConstanciaService {
	@Autowired
    private ITipoConstanciaRepository tipoConstanciaRepository;

	@Override
	public List<TipoConstancia> list() {
		
		return tipoConstanciaRepository.findAll();
	}

}
