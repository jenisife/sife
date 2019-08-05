package com.sife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sife.dao.IMatrimonioDao;
import com.sife.entities.Matrimonio;

@Service
public class MatrimonioService implements IMatrimonioService{


	@Autowired
	private IMatrimonioDao matrimonioDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Matrimonio> findAll() {
		return (List<Matrimonio>)matrimonioDao.findAll();
	}
	
	@Override
	@Transactional (readOnly=true)
	public Optional<Matrimonio> findById(Long id) {
		return matrimonioDao.findById(id);
	}
	
	@Override
	@Transactional
	public Matrimonio save(Matrimonio matrimonio) {
		return matrimonioDao.save(matrimonio);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		matrimonioDao.deleteById(id);
	}
}
