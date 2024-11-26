package com.SaludClick.SaludClick.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SaludClick.SaludClick.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);  // para logearse
}

