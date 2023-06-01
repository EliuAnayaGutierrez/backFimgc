package edu.unsch.figmc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificado_estudios")
public class CertificadoEstudios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="url",length=50)
	private String url;
	
	@Column(name="codigo",length=20)
	private String codigo;
	
	@Column(name="fecha")
	private Date fecha;
	
	@ManyToOne
	@JoinColumn
	private Usuario estudiante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Usuario estudiante) {
		this.estudiante = estudiante;
	}
	
}
