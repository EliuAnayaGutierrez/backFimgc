package edu.unsch.figmc.entities;
import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "PlanEstudios")
public class PlanEstudios implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nombre", length = 100)
    private String nombrePlan;

    
    public Escuela getEscuela() {
		return escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	@Column(name = "anio", nullable = false)
    private String anioPlan;
    
    @Column(name = "c_cocurriculares")
    private Integer c_cocurriculares;
    
    @Column(name = "c_obligatorios")
    private Integer c_obligatorios;
    
    @Column(name = "c_electivos")
    private Integer c_electivos;
    
    
    @Column(name = "c_especialidad")
    private Integer c_especialidad;
    

    @Column(name = "c_idiomas")
    private Integer c_idiomas;


    @ManyToOne
    @JoinColumn(name="escuela_id")
    private Escuela escuela;

    
 public Integer getC_cocurriculares() {
		return c_cocurriculares;
	}

	public void setC_cocurriculares(Integer c_cocurriculares) {
		this.c_cocurriculares = c_cocurriculares;
	}

	public Integer getC_obligatorios() {
		return c_obligatorios;
	}

	public void setC_obligatorios(Integer c_obligatorios) {
		this.c_obligatorios = c_obligatorios;
	}

	public Integer getC_electivos() {
		return c_electivos;
	}

	public void setC_electivos(Integer c_electivos) {
		this.c_electivos = c_electivos;
	}

	public Integer getC_especialidad() {
		return c_especialidad;
	}

	public void setC_especialidad(Integer c_especialidad) {
		this.c_especialidad = c_especialidad;
	}

	public Integer getC_idiomas() {
		return c_idiomas;
	}

	public void setC_idiomas(Integer c_idiomas) {
		this.c_idiomas = c_idiomas;
	}

	// Constructor sin argumentos para JPA
    public PlanEstudios() {
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrePlan() {
		return nombrePlan;
	}

	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}

	public String getAnioPlan() {
		return anioPlan;
	}

	public void setAnioPlan(String anioPlan) {
		this.anioPlan = anioPlan;
	}

	

    
}