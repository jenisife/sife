package com.sife.dao;

import org.springframework.data.repository.CrudRepository;

import com.sife.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
