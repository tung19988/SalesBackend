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

import com.entyti.CommentCus;
import com.service.CommentCusRepository;

@RestController
public class CommentCusApi {
	
 @Autowired
 CommentCusRepository comme;
	
	@RequestMapping(value = "/CommentCus/list", method = RequestMethod.GET)
	public List<CommentCus> list() {	  
		return comme.findAll();}
	
  @RequestMapping(value = "/CommentCus/list", method = RequestMethod.POST )
  public  CommentCus add( @Valid @RequestBody CommentCus cmt) {
      return  comme.save(cmt);
  }
  @RequestMapping(value = "/CommentCus/list/{id}", method = RequestMethod.GET)
  public Optional<CommentCus> getById(@PathVariable(value = "id") Integer CommentCusId) {
      return comme.findById(CommentCusId); 
  }
  @RequestMapping(value = "/CommentCus/list/{id}", method = RequestMethod.PUT)
  public CommentCus update(@PathVariable Integer id,@Valid @RequestBody CommentCus cmt) {
	  return comme.save(cmt); 
  }
  
  @RequestMapping(value = "/CommentCus/list/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
	    return comme.findById(id).map(record -> {
	    	comme.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	
	
  }
}