package com.sife.services;

import java.util.List;
import java.util.Optional;

import com.sife.entities.PrimeraComunion;

public interface IPrimeraComunionService {

	public List<PrimeraComunion> findAll();

	public Optional<PrimeraComunion> findById(Long id);

	public PrimeraComunion save(PrimeraComunion primeracomunion);

	public void delete(Long id);

}
