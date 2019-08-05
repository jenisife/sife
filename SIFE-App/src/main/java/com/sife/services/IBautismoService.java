package com.sife.services;

import java.util.List;
import java.util.Optional;

import com.sife.entities.Bautismo;

public interface IBautismoService {
	
public List<Bautismo> findAll();
	
	public Bautismo save(Bautismo bautismo);
	
	public Optional<Bautismo> findById(Long id);
	
	public void delete(Long id);

}
