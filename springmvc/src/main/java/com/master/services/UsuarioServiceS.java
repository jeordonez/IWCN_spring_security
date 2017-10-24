package com.master.services;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import com.master.models.Usuario;
import com.master.repositorios.UsuarioRepositorio;

public class UsuarioServiceS implements UsuarioService {

	private UsuarioRepositorio usrepo;

	@Override
	public Usuario getUser(Long user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario saveUser(Usuario us) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GrantedAuthority> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*@Override
	public Usuario getuser(Long user) {
		return usrepo.findOne(user);
	}

	@Override
	public Usuario guardarusuario(Usuario us) {
		return usrepo.save(us);
	}

	@Override
	public Usuario getrol(Long rol) {
		return usrepo.findOne(rol);
	}
	*/

}
