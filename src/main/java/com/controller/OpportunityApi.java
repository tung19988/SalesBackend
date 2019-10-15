package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entyti.Opportunity;

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
		
}
