package com.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entyti.DecWork;
import com.entyti.Employee;
import com.service.DecWorkRepository;

@RestController
public class DecWorkApi {
	@Autowired
	  DecWorkRepository dew;
	  
	  @RequestMapping(value = "/DecWork/list", method = RequestMethod.GET)
		public List<DecWork> list() {	  
			return dew.findAll();
	}
	  @RequestMapping(value = "/DecWork/list", method = RequestMethod.POST )
	  public  DecWork add( @RequestBody DecWork de) {
	      return  dew.save(de);
	  }
	  @RequestMapping(value = "/DecWork/list/{id}", method = RequestMethod.GET)
	  public Optional<DecWork> getById(@PathVariable(value = "id") Integer DecWorkId) {
	      return dew.findById(DecWorkId); 
	  }
	  @RequestMapping(value = "/DecWork/list/{id}", method = RequestMethod.PUT)
	  public DecWork update(@PathVariable Integer id,@Valid @RequestBody DecWork de) {
		  return dew.save(de); 
	  }
	  
	  @RequestMapping(value = "/DecWork/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return dew.findById(id).map(record -> {
		    	dew.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
	  
	  @RequestMapping(value = "/dw/list", method = RequestMethod.GET)
	  public Optional<List<DecWork>> ew() {	  
			return dew.E();
	}
}
