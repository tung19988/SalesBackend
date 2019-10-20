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

import com.entyti.Commentt;
import com.service.CommentRepository;

@RestController
public class CommentApi {
	 @Autowired
	  CommentRepository comm;
	  
	  @RequestMapping(value = "/Commentt/list", method = RequestMethod.GET)
		public List<Commentt> list() {	  
			return comm.findAll();
	}
	  @RequestMapping(value = "/Commentt/list", method = RequestMethod.POST )
	  public  Commentt add( @RequestBody Commentt cmt) {
	      return  comm.save(cmt);
	  }
	  @RequestMapping(value = "/Commentt/list/{id}", method = RequestMethod.GET)
	  public Optional<Commentt> getById(@PathVariable(value = "id") Integer CommenttId) {
	      return comm.findById(CommenttId); 
	  }
	  @RequestMapping(value = "/Commentt/list/{id}", method = RequestMethod.PUT)
	  public Commentt update(@PathVariable Integer id,@Valid @RequestBody Commentt cmt) {
		  return comm.save(cmt); 
	  }
	  
	  @RequestMapping(value = "/Commentt/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return comm.findById(id).map(record -> {
		    	comm.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
}
