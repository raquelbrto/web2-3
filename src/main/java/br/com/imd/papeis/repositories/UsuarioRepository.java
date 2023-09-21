package br.com.imd.papeis.repositories;

import java.util.ArrayList;
import java.util.List;

import br.com.imd.papeis.domain.Usuario;

public class UsuarioRepository {

	public static List<Usuario> usuarios = new ArrayList<Usuario>();

	public static List<Usuario> getUsuarios() {
		return usuarios;
	}

}
