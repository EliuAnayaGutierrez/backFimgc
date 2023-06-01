package edu.unsch.figmc.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.Expediente;
import edu.unsch.figmc.repositories.IExpedienteRepository;
import edu.unsch.figmc.services.IExpedienteService;

@Service
public class ExpedienteServiceImpl implements IExpedienteService {

	@Autowired
	private IExpedienteRepository expedienteRepository;

	@Override
	public List<Expediente> list() {
		return expedienteRepository.findAll();
	}

	@Override
	public Expediente registerExpediente(Expediente expediente) {
		return expedienteRepository.save(expediente);
	}

	@Override
	public byte[] findVersionByIdAndNumber(Long id, int versionNumber) {
		Expediente expediente = expedienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el expediente con ID " + id));

		switch (versionNumber) {
			case 1:
				return expediente.getVersion1();
			case 2:
				return expediente.getVersion2();
			case 3:
				return expediente.getVersion3();
			case 4:
				return expediente.getVersion4();
			default:
				throw new IllegalArgumentException("Número de versión inválido: " + versionNumber);
		}
	}

	@Override
	public Expediente findExpedienteByNroExpediente(Long nroExpediente) {
		return expedienteRepository.findExpedienteByNroExpediente(nroExpediente);
	}
	@Override
	public Expediente findExpedienteByEstado(Long estado) {
		return expedienteRepository.findExpedienteByEstado(estado);
	}

}
