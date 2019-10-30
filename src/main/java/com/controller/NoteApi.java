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

import com.entyti.Note;
import com.service.NoteRepository;

@RestController
public class NoteApi {

	 @Autowired
	  NoteRepository no;

	  
	  @RequestMapping(value = "/Note/list", method = RequestMethod.GET)
		public List<Note> list() {	  
			return no.findAll();
	}
	  @RequestMapping(value = "/Note/list", method = RequestMethod.POST )
	  public  Note add( @RequestBody Note em) {
	      return  no.save(em);
	  }
	  @RequestMapping(value = "/Note/list/{id}", method = RequestMethod.GET)
	  public Optional<Note> getById(@PathVariable(value = "id") Integer NoteId) {
	      return no.findById(NoteId); 
	  }
	  @RequestMapping(value = "/Note/list/{id}", method = RequestMethod.PUT)
	  public Note update(@PathVariable Integer id,@Valid @RequestBody Note em) {
		  return no.save(em); 
	  }
	  
	  @RequestMapping(value = "/Note/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return no.findById(id).map(record -> {
		    	no.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
}
