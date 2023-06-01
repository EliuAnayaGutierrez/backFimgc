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
@Table(name="constancia")

public class Constancia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="url_constancia",length=50)
	private String url_constancia;
	
	@Column(name="codigo",length=20)
	private String codigo;
	
	@Column(name="fecha_registro")
	private Date fecha_registro;
	
	@ManyToOne
	@JoinColumn
	private TipoConstancia tipoConstacia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl_constancia() {
		return url_constancia;
	}

	public void setUrl_constancia(String url_constancia) {
		this.url_constancia = url_constancia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public TipoConstancia getTipoConstacia() {
		return tipoConstacia;
	}

	public void setTipoConstacia(TipoConstancia tipoConstacia) {
		this.tipoConstacia = tipoConstacia;
	}
	
	
}
