package com.controller;

import java.util.Collection;
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

import com.entyti.Comment_cus;
import com.service.Comment_cusRepository;

@RestController
public class Comment_cusApi {
	@Autowired
	Comment_cusRepository comc;
	
	@RequestMapping(value = "/Commentc/list", method = RequestMethod.GET)
	public Collection<Comment_cus> list() {	  
		return comc.findAll();
}
	
  @RequestMapping(value = "/Commentc/list", method = RequestMethod.POST )
  public  Comment_cus add( @RequestBody Comment_cus cmt) {
      return  comc.save(cmt);
  }
  @RequestMapping(value = "/Commentc/list/{id}", method = RequestMethod.GET)
  public Optional<Comment_cus> getById(@PathVariable(value = "id") Integer CommenttId) {
      return comc.findById(CommenttId); 
  }
  @RequestMapping(value = "/Commentc/list/{id}", method = RequestMethod.PUT)
  public Comment_cus update(@PathVariable Integer id,@Valid @RequestBody Comment_cus cmt) {
	  return comc.save(cmt); 
  }
  
  @RequestMapping(value = "/Commentc/list/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
	    return comc.findById(id).map(record -> {
	    	comc.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	}
}
