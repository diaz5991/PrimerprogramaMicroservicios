package com.msvc.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msvc.usuario.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String>{

}
