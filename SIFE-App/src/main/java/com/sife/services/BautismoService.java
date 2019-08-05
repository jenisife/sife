package com.sife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sife.dao.IBautismoDao;
import com.sife.entities.Bautismo;

@Service
public class BautismoService implements IBautismoService{
	
	@Autowired
	private IBautismoDao bautismodao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Bautismo> findAll(){
		return (List<Bautismo>) bautismodao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Optional<Bautismo> findById(Long id) {
		return bautismodao.findById(id);
	}
	
	@Override
	@Transactional
	public Bautismo save(Bautismo bautismo) {
		return bautismodao.save(bautismo);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		bautismodao.deleteById(id);
	}

}
