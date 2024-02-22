package com.msvc.usuario.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msvc.usuario.entity.Usuario;
import com.msvc.usuario.exception.ResourceNotFoundException;
import com.msvc.usuario.repository.UsuarioRepository;
import com.msvc.usuario.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		String randomUsuarioId= UUID.randomUUID().toString();
		usuario.setUsuarioId(randomUsuarioId);		
	
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario getUsuario(String usuarioID) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(usuarioID).orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con el ID: " + usuarioID));
	}

}
