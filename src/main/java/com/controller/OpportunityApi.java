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

import com.entyti.Opportunity;
import com.entyti.Workk;
import com.service.OpportunityRepository;

@RestController
public class OpportunityApi {
	@Autowired
	OpportunityRepository opp ;
	
	 @RequestMapping(value = "/opp/list", method = RequestMethod.GET)
	public List<Opportunity> listopp(){
		return opp.findAll();
	}
	 
	 @RequestMapping(value = "/opp/list", method = RequestMethod.POST)
	  public Opportunity addOpportunity(@Valid @RequestBody Opportunity Opportunity) {
	      return  opp.save(Opportunity);
	  }
	 @RequestMapping(value = "/opp/list/{id}", method = RequestMethod.GET)
	  public Optional<Opportunity> getById(@PathVariable(value = "id") Integer OppId) {
	      return opp.findById(OppId); 
	  }
	 @RequestMapping(value = "/opp/list/{id}", method = RequestMethod.PUT)
	  public Opportunity update(@PathVariable Integer id,@Valid @RequestBody Opportunity oppo) {
		  return opp.save(oppo); 
	  }
	 @RequestMapping(value = "/opp/list/{id}", method = RequestMethod.DELETE)
	  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
		    return opp.findById(id).map(record -> {
		    	opp.deleteById(id);
		            return ResponseEntity.ok().build();
		        }).orElse(ResponseEntity.notFound().build());
		}
}
