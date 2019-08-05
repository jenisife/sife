package com.sife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.sife.dao.IParroquiaDao;
import com.sife.entities.Parroquia;

@Service
public class ParroquiaService implements IParroquiaService{
	
	
	@Autowired
	private IParroquiaDao parroquiadao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Parroquia> findAll(){
		return (List<Parroquia>) parroquiadao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Optional<Parroquia> findById(String id) {
		return parroquiadao.findById(id);
	}
	
	@Override
	@Transactional
	public Parroquia save(Parroquia parroquia) {
		return parroquiadao.save(parroquia);
	}
	
	@Override
	@Transactional
	public void delete(String id) {
		parroquiadao.deleteById(id);
	}

}
