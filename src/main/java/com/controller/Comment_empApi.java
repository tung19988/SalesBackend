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

import com.entyti.Comment_emp;
import com.entyti.Commentt;
import com.service.Comment_empRepository;

@RestController
public class Comment_empApi {
@Autowired
Comment_empRepository come;

@RequestMapping(value = "/Commente/list", method = RequestMethod.GET)
		public List<Comment_emp> list() {	  
			return come.findAll();
	}
	  @RequestMapping(value = "/Commente/list", method = RequestMethod.POST )
	  public  Comment_emp add( @RequestBody Comment_emp cmt) {
	      return  come.save(cmt);
	  }
	  @RequestMapping(value = "/Commente/list/{id}", method = RequestMethod.GET)
	  public Optional<Comment_emp> getById(@PathVariable(value = "id") Integer CommenttId) {
	      return come.findById(CommenttId); 
	  }
	  @RequestMapping(value = "/Commente/list/{id}", method = RequestMethod.PUT)
	  public Comment_emp update(@PathVariable Integer id,@Valid @RequestBody Comment_emp cmt) {
		  return come.save(cmt); 
	  }
	  
	  @RequestMapping(value = "/Commente/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return come.findById(id).map(record -> {
		    	come.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
}
