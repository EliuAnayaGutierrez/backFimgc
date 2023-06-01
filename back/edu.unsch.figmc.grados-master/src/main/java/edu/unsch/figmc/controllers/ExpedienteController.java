package edu.unsch.figmc.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.unsch.figmc.entities.Expediente;
import edu.unsch.figmc.services.IExpedienteService;

@RestController
@RequestMapping("/api/expediente")
@CrossOrigin(origins = "http://localhost:5173")
public class ExpedienteController {
    @Autowired
    private IExpedienteService expedienteService;
    
    @GetMapping(value="/listar", produces=MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Expediente> listarExpediente() {
        return expedienteService.list();
    }
    
    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public Expediente obtenerExpediente(@PathVariable("id") Long id) {
        return expedienteService.findExpedienteByNroExpediente(id);
    }
    //OBTENER LA RUTA DE LA CARPETA DOCUMENTOS 
    private Path obtenerRutaDocumentos() {
        Path documentosPath = Paths.get("documentos");
        return documentosPath.toAbsolutePath();
    }
    
    @PostMapping(value = "/registrar", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @CrossOrigin(origins = "http://localhost:5173")
    public Expediente subirExpediente(@RequestParam("pdf") MultipartFile pdf, @RequestParam("expediente") String expedienteJson) {
        try {
            byte[] pdfBytes = pdf.getBytes();

            // Genera un nombre único para el archivo
            String nombreArchivo = UUID.randomUUID().toString() + ".pdf";

            // Guarda el archivo en la carpeta "documentos"
            Path rutaArchivo = Paths.get("documentos", nombreArchivo);
            Files.write(rutaArchivo, pdfBytes);

            // Registro adicional
            System.out.println("Leyendo el archivo PDF: " + pdf.getOriginalFilename());
            System.out.println("Bytes del archivo PDF leídos: " + pdfBytes.length);
            System.out.println("Contenido de algunos bytes del archivo PDF: " + Arrays.toString(Arrays.copyOfRange(pdfBytes, 0, 10)));

            // Parsea el JSON del expediente
            Expediente expediente = new ObjectMapper().readValue(expedienteJson, Expediente.class);

            // Guarda la ruta de archivo en la entidad Expediente
            expediente.setRutaDocumento(rutaArchivo.toString());

            return expedienteService.registerExpediente(expediente);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al leer los bytes del archivo PDF");
        }
    }




    
    @GetMapping("/{id}/version/{versionNumber}")
    @CrossOrigin(origins = "http://localhost:5173")
    public byte[] obtenerVersionDocumento(
        @PathVariable("id") Long id,
        @PathVariable("versionNumber") int versionNumber
    ) {
        return expedienteService.findVersionByIdAndNumber(id, versionNumber);
    }
	
	//PARA EL PROCESO DE BACHILLER
	
}
