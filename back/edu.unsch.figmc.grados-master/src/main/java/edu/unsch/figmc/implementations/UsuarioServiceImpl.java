package edu.unsch.figmc.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.unsch.figmc.Hash;
import edu.unsch.figmc.entities.Escuela;
import edu.unsch.figmc.entities.Usuario;
import edu.unsch.figmc.repositories.IEscuelaRepository;
import edu.unsch.figmc.repositories.IUsuarioRepository;
import edu.unsch.figmc.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
    @Autowired
	private IUsuarioRepository usuarioRepository;
    
    @Autowired
	private IEscuelaRepository escuelaRepository;

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario register(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario updateUsuario(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findUsuarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findUsuarioByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findUsuarioByEscuela(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
