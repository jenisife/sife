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

import com.sife.entities.Bautismo;
import com.sife.services.IBautismoService;


@RestController
@RequestMapping("bautismo")
public class BautismoController {
	

	@Autowired
	private IBautismoService bautismo;
	
	//@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
	@GetMapping("")
	private List<Bautismo> findAll(){
		return bautismo.findAll();
	}
	
	//@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
	@GetMapping("/{id}")
	public Optional<Bautismo> findById(@PathVariable(value = "id")Long id){
        return bautismo.findById(id);
	}
	
	//@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
	@PostMapping("")
    public int add(@RequestBody(required = true)Bautismo baut){
       bautismo.save(baut);
     //  categoria.flush();
       return (int) baut.getFedebautismo();
    }
	
	//@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
	@PutMapping("/{id}")
    public int update(@RequestBody (required = true)Bautismo baut){
        bautismo.save(baut);
        //categoria.flush();
        return (int) baut.getFedebautismo();
    }
	
	//@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
    	bautismo.delete(id); 
    }
		


}
