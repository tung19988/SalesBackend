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

import com.entyti.Employee;
import com.service.EmployeeRepository;

@RestController
public class EmployeeApi {

	 @Autowired
	  EmployeeRepository empl;
	  
	  @RequestMapping(value = "/Employee/list", method = RequestMethod.GET)
		public List<Employee> list() {	  
			return empl.findAll();
	}
	  @RequestMapping(value = "/Employee/list", method = RequestMethod.POST )
	  public  Employee add( @RequestBody Employee em) {
	      return  empl.save(em);
	  }
	  @RequestMapping(value = "/Employee/list/{id}", method = RequestMethod.GET)
	  public Optional<Employee> getById(@PathVariable(value = "id") Integer EmployeeId) {
	      return empl.findById(EmployeeId); 
	  }
	  @RequestMapping(value = "/Employee/list/{id}", method = RequestMethod.PUT)
	  public Employee update(@PathVariable Integer id,@Valid @RequestBody Employee em) {
		  return empl.save(em); 
	  }
	  
	  @RequestMapping(value = "/Employee/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return empl.findById(id).map(record -> {
		    	empl.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
}
