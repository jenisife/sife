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

import com.sife.entities.Matrimonio;
import com.sife.services.IMatrimonioService;

@RestController
@RequestMapping("matrimonio")
public class MatrimonioController {

	@Autowired
	private IMatrimonioService matrimonio;
	
	@GetMapping("")
	private List<Matrimonio> findAll() {
		return matrimonio.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Matrimonio> findById(@PathVariable(value = "id")Long id){
		return matrimonio.findById(id);
	}
	
	@PostMapping("")
	public int add(@RequestBody(required = true)Matrimonio mat){
		matrimonio.save(mat);
		return (int) mat.getMatrimonio();
	}
	
	@PutMapping("/{fedebautismo}")
	public int update(@RequestBody (required = true) Matrimonio matr) {
		matrimonio.save(matr);
		return (int) matr.getMatrimonio();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		matrimonio.delete(id);
	}
}
