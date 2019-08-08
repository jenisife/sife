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

import com.sife.entities.Usuario;
import com.sife.services.IUsuarioService;

@RestController
@RequestMapping("Usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuario;
	
	@GetMapping("")
	private List<Usuario> findAll() {
		return usuario.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> findById(@PathVariable(value = "id")Long id){
		return usuario.findById(id);
	}
	
	@PostMapping("")
	public int add(@RequestBody(required = true)Usuario usu){
		usuario.save(usu);
		return (int) usu.getId();
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody (required = true) Usuario usua) {
		usuario.save(usua);
		return (int) usua.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		usuario.delete(id);
	}
}
