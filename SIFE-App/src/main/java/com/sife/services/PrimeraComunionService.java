package com.sife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sife.dao.IPrimeraComunionDao;
import com.sife.entities.PrimeraComunion;

@Service
public class PrimeraComunionService implements IPrimeraComunionService{

	@Autowired
	private IPrimeraComunionDao primeracomunionDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<PrimeraComunion> findAll() {
		return (List<PrimeraComunion>)primeracomunionDao.findAll();
	}
	
	@Override
	@Transactional (readOnly=true)
	public Optional<PrimeraComunion> findById(Long id) {
		return primeracomunionDao.findById(id);
	}
	
	@Override
	@Transactional
	public PrimeraComunion save(PrimeraComunion primeracomunion) {
		return primeracomunionDao.save(primeracomunion);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		primeracomunionDao.deleteById(id);
	}
}
