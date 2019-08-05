package com.sife.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sife.entities.Parroquia;
import com.sife.services.IParroquiaService;

@RestController
@RequestMapping("parroquia")
public class ParroquiaController {

	@Autowired
	private IParroquiaService parroquia;
	
	@GetMapping("")
	private List<Parroquia> findAll() {
		return parroquia.findAll();
	}
	
	@GetMapping("/{nombreparroquia}")
	public Optional<Parroquia> findById(@PathVariable(value = "nombreparroquia")String nombreparroquia){
		return parroquia.findById(nombreparroquia);
	}
	
	@PostMapping("")
	public String add(@RequestBody(required = true)Parroquia par){
		parroquia.save(par);
		return (String) par.getNombreparroquia();
	}
	
	@PutMapping("/{nombreparroquia}")
	public String update(@RequestBody (required = true) Parroquia parr) {
		parroquia.save(parr);
		return (String) parr.getNombreparroquia();
	}
	
	@DeleteMapping("/{nombreparroquia}")
	public void delete(@PathVariable("nombreparroquia") String nombreparroquia) {
		parroquia.delete(nombreparroquia);
	}
}
