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

@Entity
@Table(name = "Documento")
public class Documento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long  id;

	@Column(name = "numeroDocumento", length=15)
	private String numeroDocumento;



	@Column(name = "fechaGeneracion")
	private Date fechaGeneracion;

	@Column(name = "fechaEnvio")
	private Date fechaEnvio;

	@Column(name = "fechaRecepcion")
	private Date fechaRecepcion;
	
	@Lob
	@Column(name = "archivopdfSF")
	private byte[] archivopdfSF;
	
	@Lob
	@Column(name = "archivopdfCF")
	private byte[] archivopdfCF;
	

	@ManyToOne
	@JoinColumn
	private TipoDocumento tipoDocumento;

	@ManyToOne
	@JoinColumn
	private Expediente expediente;

	
	// Constructor, getters and setters
	public Documento() {

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}


	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}


	public Date getFechaEnvio() {
		return fechaEnvio;
	}


	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}


	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}


	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}


	public byte[] getArchivopdfSF() {
		return archivopdfSF;
	}


	public void setArchivopdfSF(byte[] archivopdfSF) {
		this.archivopdfSF = archivopdfSF;
	}


	public byte[] getArchivopdfCF() {
		return archivopdfCF;
	}


	public void setArchivopdfCF(byte[] archivopdfCF) {
		this.archivopdfCF = archivopdfCF;
	}


	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public Expediente getExpediente() {
		return expediente;
	}


	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}




 
