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

import com.entyti.Department;
import com.service.DepartmentRepository;


@RestController
public class DepartmentApi {
	 @Autowired
	  DepartmentRepository depart;
	  
	  @RequestMapping(value = "/department/list", method = RequestMethod.GET)
		public List<Department> list() {	  
			return depart.findAll();
	}
	  @RequestMapping(value = "/department/list", method = RequestMethod.POST )
	  public  Department add( @RequestBody Department de) {
	      return  depart.save(de);
	  }
	  @RequestMapping(value = "/department/list/{id}", method = RequestMethod.GET)
	  public Optional<Department> getById(@PathVariable(value = "id") Integer DepartmentId) {
	      return depart.findById(DepartmentId); 
	  }
	  @RequestMapping(value = "/department/list/{id}", method = RequestMethod.PUT)
	  public Department update(@PathVariable Integer id,@Valid @RequestBody Department de) {
		  return depart.save(de); 
	  }
	  
	  @RequestMapping(value = "/department/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return depart.findById(id).map(record -> {
		    	depart.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
}
