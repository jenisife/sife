package com.sife.services;

import java.util.List;
import java.util.Optional;

import com.sife.entities.Parroquia;

public interface IParroquiaService {
	
	public List<Parroquia> findAll();
	
	public Parroquia save(Parroquia parroquia);

	public Optional<Parroquia> findById(String id);

	public void delete(String id);

}
