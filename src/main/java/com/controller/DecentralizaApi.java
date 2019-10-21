package com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entyti.Decentraliza;
import com.entyti.Opportunity;
import com.service.DecentralizaRepository;

@RestController
public class DecentralizaApi {
@Autowired
DecentralizaRepository de;

@RequestMapping(value = "/dec/list", method = RequestMethod.GET)
	public List<Decentraliza> listde(){
		return de.findAll();
	}
@RequestMapping(value = "/dec/list", method = RequestMethod.POST)
public Decentraliza addDecentraliza(@Valid @RequestBody Decentraliza Decentraliza) {
    return  de.save(Decentraliza);
}
@RequestMapping(value = "/dec/list/{id}", method = RequestMethod.GET)
public Optional<Decentraliza> getById(@PathVariable(value = "id") Integer DecId) {
    return de.findById(DecId); 
}
@RequestMapping(value = "/dec/list/{id}", method = RequestMethod.PUT)
public Decentraliza update(@PathVariable Integer id,@Valid @RequestBody Decentraliza dece) {
	  return de.save(dece); 
}
@RequestMapping(value = "/dec/list/{id}", method = RequestMethod.DELETE)
public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
	    return de.findById(id).map(record -> {
	    	de.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	}
}
