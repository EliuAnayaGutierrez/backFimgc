package edu.unsch.figmc.services;

import java.util.List;

import edu.unsch.figmc.entities.Usuario;

public interface IUsuarioService {
	List<Usuario> listarUsuarios();
	Usuario register(Usuario entity);
	Usuario updateUsuario(Usuario entity);
	Usuario findUsuarioById(Long id);
	//Usuario findUsuarioByCodigo(String codigo);
	Usuario findUsuarioByUsername(String username);
	List<Usuario> findUsuarioByEscuela(Long id);
}
