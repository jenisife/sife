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

import com.sife.entities.Confirmacion;
import com.sife.services.IConfirmacionService;

@RestController
@RequestMapping("confirmacion")
public class ConfirmacionController {

	@Autowired
	private IConfirmacionService confirmacion;
	
	@GetMapping("")
	private List<Confirmacion> findAll() {
		return confirmacion.findAll();
	}
	
	@GetMapping("/{actadeconfirmacion}")
	public Optional<Confirmacion> findById(@PathVariable(value = "actadeconfirmacion")Long actadeconfirmacion){
		return confirmacion.findById(actadeconfirmacion);
	}
	
	@PostMapping("")
	public int add(@RequestBody(required = true)Confirmacion con){
		confirmacion.save(con);
		return (int) con.getActadeconfirmacion();
	}
	
	@PutMapping("/{actadeconfirmacion}")
	public int update(@RequestBody (required = true) Confirmacion conf) {
		confirmacion.save(conf);
		return (int) conf.getActadeconfirmacion();
	}
	
	@DeleteMapping("/{actadeconfirmacion}")
	public void delete(@PathVariable("actadeconfirmacion") long actadeconfirmacion) {
		confirmacion.delete(actadeconfirmacion);
	}
}
