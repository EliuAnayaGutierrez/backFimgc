package edu.unsch.figmc.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.CertificadoIngles;
import edu.unsch.figmc.repositories.ICertificadoInglesRepository;
import edu.unsch.figmc.services.ICertificadoInglesService;
@Service
public class CertificadoInglesServiceImpl implements ICertificadoInglesService {
	@Autowired
	private ICertificadoInglesRepository certificadoRepository;
	@Override
	public List<CertificadoIngles> list() {
		return certificadoRepository.findAll();
	}
	@Override
	public CertificadoIngles register(CertificadoIngles entity) {
		return certificadoRepository.save(entity);
	}
	@Override
	public CertificadoIngles update(CertificadoIngles entity) {
		return certificadoRepository.save(entity);
	}

}
