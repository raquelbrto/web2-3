package br.com.imd.papeis.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.papeis.domain.Usuario;
import br.com.imd.papeis.repositories.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@RequestMapping("/usuarios")
	public List<Usuario> getPapeis() {
		return UsuarioRepository.getUsuarios();
	}

}
