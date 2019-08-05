package com.sife.services;

import java.util.List;
import java.util.Optional;

import com.sife.entities.Matrimonio;

public interface IMatrimonioService {

	public List<Matrimonio> findAll();

	public Optional<Matrimonio> findById(Long id);

	public Matrimonio save(Matrimonio matrimonio);

	public void delete(Long id);

}
