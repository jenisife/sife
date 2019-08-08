package com.sife.services;

import java.util.List;
import java.util.Optional;

import com.sife.entities.Confirmacion;

public interface IConfirmacionService {


    public List<Confirmacion> findAll();
	
	public Confirmacion save(Confirmacion confirmacion);
	
	public void delete(Long id);

	public Optional<Confirmacion> findById(Long id);

}
