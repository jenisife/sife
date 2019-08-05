package com.sife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sife.dao.IConfirmacionDao;
import com.sife.entities.Confirmacion;

@Service
public class ConfirmacionService implements IConfirmacionService {

	@Autowired
	private IConfirmacionDao confirmacionDao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Confirmacion> findAll() {
		return (List<Confirmacion>) confirmacionDao.findAll();
	}
	
	@Override
	@Transactional (readOnly=true)
	public Optional<Confirmacion> findById(Long id) {
		return confirmacionDao.findById(id);
	}
	
	@Override
	@Transactional
	public Confirmacion save(Confirmacion confirmacion) {
		return confirmacionDao.save(confirmacion);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		confirmacionDao.deleteById(id);
	}
	
}