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

import com.entyti.Emp_work;
import com.service.Emp_workRepository;

@RestController
public class Emp_workApi {
	 @Autowired
	 Emp_workRepository empw;
	 
	 @RequestMapping(value = "/Empw/list", method = RequestMethod.GET)
		public List<Emp_work> list() {	  
			return empw.findAll();
	}
	 @RequestMapping(value = "/Empw/list", method = RequestMethod.POST )
	  public  Emp_work add( @RequestBody Emp_work em) {
	      return  empw.save(em);
	  }
	  @RequestMapping(value = "/Empw/list/{id}", method = RequestMethod.GET)
	  public Optional<Emp_work> getById(@PathVariable(value = "id") Integer EmployeeId) {
	      return empw.findById(EmployeeId); 
	  }
	  @RequestMapping(value = "/Empw/list/{id}", method = RequestMethod.PUT)
	  public Emp_work update(@PathVariable Integer id,@Valid @RequestBody Emp_work em) {
		  return empw.save(em); 
	  }
	  
	  @RequestMapping(value = "/Empw/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return empw.findById(id).map(record -> {
		    	empw.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
}
