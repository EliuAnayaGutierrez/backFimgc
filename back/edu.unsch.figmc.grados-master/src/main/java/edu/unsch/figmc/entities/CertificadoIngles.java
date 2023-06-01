package edu.unsch.figmc.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificado_ingles")

public class CertificadoIngles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="url",length=50)
	private String url;
	
	@Column(name="codigo",length=20)
	private String codigo;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn private Nivel nivel;
	 */

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

	/*
	 * public Nivel getNivel() { return nivel; }
	 * 
	 * public void setNivel(Nivel nivel) { this.nivel = nivel; }
	 */
	

}
