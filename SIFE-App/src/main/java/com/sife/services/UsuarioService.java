package com.sife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sife.dao.IUsuarioDao;
import com.sife.entities.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Usuario> findAll() {
		return (List<Usuario>)usuarioDao.findAll();
	}
	
	@Override
	@Transactional (readOnly=true)
	public Optional<Usuario> findById(Long id) {
		return usuarioDao.findById(id);
	}
	
	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}
}
