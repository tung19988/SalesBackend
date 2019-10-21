package com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDaoImpl;
import com.dao.WorkkDaoImpl;
import com.entyti.Customer;
import com.entyti.Workk;
import com.service.WorkkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@RestController

public class WorkkApi {

  @Autowired
  WorkkRepository workk;
  
  @RequestMapping(value = "/workk/list", method = RequestMethod.GET)
	public List<Workk> list() {	  
		return workk.findAll();
}
  @RequestMapping(value = "/workk/list", method = RequestMethod.POST)
  public Workk add(@Valid @RequestBody Workk work) {
      return  workk.save(work);
  }
  @RequestMapping(value = "/workk/list/{id}", method = RequestMethod.GET)
  public Optional<Workk> getById(@PathVariable(value = "id") Integer WorkkId) {
      return workk.findById(WorkkId); 
  }
  @RequestMapping(value = "/workk/list/{id}", method = RequestMethod.PUT)
  public Workk update(@PathVariable Integer id,@Valid @RequestBody Workk work) {
	  return workk.save(work); 
  }
  
  @RequestMapping(value = "/workk/list/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
	    return workk.findById(id).map(record -> {
	    	workk.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	}
  @RequestMapping(value = "/w/list1", method = RequestMethod.GET)
  public List<Workk> listEmpl() {
  	List<Workk> theEmployees= new WorkkDaoImpl().find();
  	return theEmployees;
  	}
}
