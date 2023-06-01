package edu.unsch.figmc.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="username",length=150)
	private String username;
	
	@Column(name="password",length=256)
	private String password;
	
	@Column(name="nombres",length=100)
	private String nombres;
	
	@Column(name="apellidos",length=100)
	private String apellidos;
	
	/*
	 * @Column(name="nombreCompleto",length=200) private String nombreCompleto;
	 */
	
	/*
	 * @Column(name="domicilio",length=200) private String domicilio;
	 */
	
	@Column(name="dni",length=8)
	private String dni;
	
	@Column(name="telefono",length=10)
	private String telefono;
	
	@Column(name="correoElectronico",length=100)
	private String correoElectronico;
	
	@Column(name = "estado", length=100)
    private String estado; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Escuela escuela;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Rol rol;
	
	
   
	public Usuario() {
	
 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/*
	 * public String getNombreCompleto() { return nombreCompleto; }
	 * 
	 * public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto =
	 * nombreCompleto; }
	 */

	/*
	 * public String getDomicilio() { return domicilio; }
	 * 
	 * public void setDomicilio(String domicilio) { this.domicilio = domicilio; }
	 */

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Escuela getEscuela() {
		return escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	
	
	
}
