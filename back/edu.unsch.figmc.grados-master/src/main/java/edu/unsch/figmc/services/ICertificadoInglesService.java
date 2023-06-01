package edu.unsch.figmc.services;

import java.util.List;

import edu.unsch.figmc.entities.CertificadoIngles;

public interface ICertificadoInglesService {
	List<CertificadoIngles> list();
	CertificadoIngles register(CertificadoIngles entity);
	CertificadoIngles update(CertificadoIngles entity);
}
