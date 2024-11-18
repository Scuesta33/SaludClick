package com.SaludClick.SaludClick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SaludClick.SaludClick.model.Usuario;
import com.SaludClick.SaludClick.service.UsuarioServiceImp;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
@Autowired
	private UsuarioServiceImp usuarioServiceImp;
@PostMapping("/registrar")
	public Usuario registrarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImp.registrar(usuario);
	}
@GetMapping("/{email}")    
    public Usuario traerUsuarioPorEmail(@PathVariable String email) {
    	return usuarioServiceImp.buscarPorEmail(email).orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
    }
	
	
	}
