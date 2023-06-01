package edu.unsch.figmc.services;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import edu.unsch.figmc.entities.Expediente;
import edu.unsch.figmc.entities.Tramite;
@Service
public interface IExpedienteService {
    List<Expediente> list();
    Expediente registerExpediente(Expediente expediente);
    Expediente findExpedienteByNroExpediente(Long id);
    Expediente findExpedienteByEstado(Long id);
    byte[] findVersionByIdAndNumber(Long id, int versionNumber);
}
