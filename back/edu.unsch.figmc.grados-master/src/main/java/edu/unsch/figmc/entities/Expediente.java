package edu.unsch.figmc.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Expediente")
public class Expediente implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nroExpediente", length=100,unique=true)
    private String nroExpediente;
    
    @Column(name = "fechaPresentacion")
    @Temporal(TemporalType.DATE)
    private Date fechaPresentacion;

    @Column(name = "dependencia")
    private String dependencia;

    @Column(name = "estado")
    private String estado;

    @Column(name = "modalidadIngreso", length=50)
    private byte[] modalidadIngreso;
        
    @Column(name = "concursoAdmision", length=50)
    private String concursoAdmision;

    @Column(name = "nroResolucionIngreso", length=100)
    private String nroResolucionIngreso;

    @Column(name = "fechaPrimMatricula", length=100)
    private String fechaPrimMatricula;

    @Column(name = "fechaEgreso", length=100)
    private String fechaEgreso;

    @Column(name = "codReciboCaja", length=100)
    private String codReciboCaja;

    @Column(name = "fechaReciboCaja", length=100)
    private String fechaReciboCaja;

    @Column(name = "nombreAsesor", length=100)
    private String nombreAsesor;

    @Column(name = "tituloTesis", length=200)
    private String tituloTesis;
    
    @Column(name = "nroMemoEscuela")
    private String nroMemoEscuela;
    
    @Column(name = "fechaMemoEscuela")
    private String fechaMemoEscuela;
    
    @Column(name = "nroDictEscuela")
    private String nroDictEscuela;
    
    @Column(name = "rutaDocumento")
    private String rutaDocumento;
    
    @Column(name = "nroCertEstudios")
    private String nroCertEstudios;
    
    public String getNroCertEstudios() {
		return nroCertEstudios;
	}


	public void setNroCertEstudios(String nroCertEstudios) {
		this.nroCertEstudios = nroCertEstudios;
	}


	public String getRutaDocumento() {
		return rutaDocumento;
	}


	public void setRutaDocumento(String rutaDocumento) {
		this.rutaDocumento = rutaDocumento;
	}


	public String getNroMemoEscuela() {
		return nroMemoEscuela;
	}


	public void setNroMemoEscuela(String nroMemoEscuela) {
		this.nroMemoEscuela = nroMemoEscuela;
	}


	public String getFechaMemoEscuela() {
		return fechaMemoEscuela;
	}


	public void setFechaMemoEscuela(String fechaMemoEscuela) {
		this.fechaMemoEscuela = fechaMemoEscuela;
	}


	public String getNroDictEscuela() {
		return nroDictEscuela;
	}


	public void setNroDictEscuela(String nroDictEscuela) {
		this.nroDictEscuela = nroDictEscuela;
	}


	public String getFechaDictEscuela() {
		return fechaDictEscuela;
	}


	public void setFechaDictEscuela(String fechaDictEscuela) {
		this.fechaDictEscuela = fechaDictEscuela;
	}

	@Column(name = "fechaDictEscuela")
    private String fechaDictEscuela;
    
    @Lob
    @Column(name="pdf",nullable=true)
    private byte[] pdf;
   
    @Lob
    @Column(name="version1",nullable=true)
    private byte[] version1;
    
    
    @Lob
    @Column(name="version2",nullable=true)
    private byte[] version2;
    
    
    @Lob
    @Column(name="version3",nullable=true)
    private byte[] version3;
    
    
    @Lob
    @Column(name="version4",nullable=true)
    private byte[] version4;
      
    @ManyToOne
    @JoinColumn
    private Tramite tramite;
    
    // Constructor sin argumentos para JPA
    public Expediente() {
    
    }

    
    //Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNroExpediente() {
		return nroExpediente;
	}

	public void setNroExpediente(String nroExpediente) {
		this.nroExpediente = nroExpediente;
	}

	public Date getFechaPresentacion() {
		return fechaPresentacion;
	}

	public void setFechaPresentacion(Date fechaPresentacion) {
		this.fechaPresentacion = fechaPresentacion;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public byte[] getModalidadIngreso() {
		return modalidadIngreso;
	}

	public void setModalidadIngreso(byte[] modalidadIngreso) {
		this.modalidadIngreso = modalidadIngreso;
	}

	public String getConcursoAdmision() {
		return concursoAdmision;
	}

	public void setConcursoAdmision(String concursoAdmision) {
		this.concursoAdmision = concursoAdmision;
	}

	public String getNroResolucionIngreso() {
		return nroResolucionIngreso;
	}

	public void setNroResolucionIngreso(String nroResolucionIngreso) {
		this.nroResolucionIngreso = nroResolucionIngreso;
	}

	public String getFechaPrimMatricula() {
		return fechaPrimMatricula;
	}

	public void setFechaPrimMatricula(String fechaPrimMatricula) {
		this.fechaPrimMatricula = fechaPrimMatricula;
	}

	public String getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(String fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	public String getCodReciboCaja() {
		return codReciboCaja;
	}

	public void setCodReciboCaja(String codReciboCaja) {
		this.codReciboCaja = codReciboCaja;
	}

	public String getFechaReciboCaja() {
		return fechaReciboCaja;
	}

	public void setFechaReciboCaja(String fechaReciboCaja) {
		this.fechaReciboCaja = fechaReciboCaja;
	}

	public String getNombreAsesor() {
		return nombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}

	public String getTituloTesis() {
		return tituloTesis;
	}

	public void setTituloTesis(String tituloTesis) {
		this.tituloTesis = tituloTesis;
	}

	public byte[] getPdf() {
		return pdf;
	}

	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}

	public byte[] getVersion1() {
		return version1;
	}

	public void setVersion1(byte[] version1) {
		this.version1 = version1;
	}

	public byte[] getVersion2() {
		return version2;
	}

	public void setVersion2(byte[] version2) {
		this.version2 = version2;
	}

	public byte[] getVersion3() {
		return version3;
	}

	public void setVersion3(byte[] version3) {
		this.version3 = version3;
	}

	public byte[] getVersion4() {
		return version4;
	}

	public void setVersion4(byte[] version4) {
		this.version4 = version4;
	}

	public Tramite getTramite() {
		return tramite;
	}

	public void setTramite(Tramite tramite) {
		this.tramite = tramite;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
	
    
    }