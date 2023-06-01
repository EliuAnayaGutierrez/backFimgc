package edu.unsch.figmc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unsch.figmc.entities.Usuario;
import edu.unsch.figmc.entities.Escuela;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long>{
	public Usuario findUsuarioById(Long id);
	public Usuario findUsuarioByUsername(String username);
	public List<Usuario> findUsuarioByEscuela(Escuela escuela);
	
}
