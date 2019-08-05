package com.sife.services;

import java.util.List;
import java.util.Optional;

import com.sife.entities.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Optional<Usuario> findById(Long id);

	public Usuario save(Usuario usuario);

	public void delete(Long id);

}
