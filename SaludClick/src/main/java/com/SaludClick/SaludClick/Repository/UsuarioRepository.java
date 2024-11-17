package com.SaludClick.SaludClick.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SaludClick.SaludClick.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);  // For login
}

