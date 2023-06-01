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
@Table(name="solicitud")
public class Solicitud {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="url_recibo",length=50)
	private String url_recibo;
	
	@Column(name="codigo_recibo",length=20)
	private String codigo_recibo;
	
	@Column(name="fecha_recepcion")
	private Date fecha_recepcion;
	
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	
	@ManyToOne
	@JoinColumn
	private Usuario estudiante;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUrl_recibo() {
		return url_recibo;
	}


	public void setUrl_recibo(String url_recibo) {
		this.url_recibo = url_recibo;
	}


	public String getCodigo_recibo() {
		return codigo_recibo;
	}


	public void setCodigo_recibo(String codigo_recibo) {
		this.codigo_recibo = codigo_recibo;
	}


	public Date getFecha_recepcion() {
		return fecha_recepcion;
	}


	public void setFecha_recepcion(Date fecha_recepcion) {
		this.fecha_recepcion = fecha_recepcion;
	}


	public Date getFecha_creacion() {
		return fecha_creacion;
	}


	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


	public Usuario getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Usuario estudiante) {
		this.estudiante = estudiante;
	}

}
