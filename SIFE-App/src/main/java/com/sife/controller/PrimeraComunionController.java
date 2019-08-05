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

import com.sife.entities.PrimeraComunion;
import com.sife.services.IPrimeraComunionService;

@RestController
@RequestMapping("primeracomunion")
public class PrimeraComunionController {

	@Autowired
	private IPrimeraComunionService comunion;
	
	@GetMapping("")
	private List<PrimeraComunion> findAll() {
		return comunion.findAll();
	}
	
	@GetMapping("/{actaprimeracomunion}")
	public Optional<PrimeraComunion> findById(@PathVariable(value = "actaprimeracomunion")Long actaprimeracomunion){
		return comunion.findById(actaprimeracomunion);
	}
	
	@PostMapping("")
	public int add(@RequestBody(required = true)PrimeraComunion pri){
		comunion.save(pri);
		return (int) pri.getActaprimeracomunion();
	}
	
	@PutMapping("/{actaprimeracomunion}")
	public int update(@RequestBody (required = true) PrimeraComunion prim) {
		comunion.save(prim);
		return (int) prim.getActaprimeracomunion();
	}
	
	@DeleteMapping("/{actaprimeracomunion}")
	public void delete(@PathVariable("actaprimeracomunion") long actaprimeracomunion) {
		comunion.delete(actaprimeracomunion);
	}
}
