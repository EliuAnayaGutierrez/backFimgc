package edu.unsch.figmc.services;

import java.util.List;

import edu.unsch.figmc.entities.CertificadoEstudios;

public interface ICertificadoEstudiosService {
	List<CertificadoEstudios> list();
	CertificadoEstudios register(CertificadoEstudios entity);
	CertificadoEstudios update(CertificadoEstudios entity);
}
