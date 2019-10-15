package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.entyti.Opportunity;
import com.service.OpportunityRepository;
import com.service.WorkkRepository;

public class OpportunityDaoImpl implements OpportunityDao {
private OpportunityRepository opportunityRepository;
	
	@Autowired
	public OpportunityDaoImpl(OpportunityRepository theOpportunityRepository) {
		opportunityRepository = theOpportunityRepository;
	}
	@Override
	public List<Opportunity> findAll() {
		// TODO Auto-generated method stub
		return opportunityRepository.findAll() ;
	}

	@Override
	public Optional<Opportunity> findById(int theId) {
		// TODO Auto-generated method stub
		return opportunityRepository.findById(theId);
	}

	@Override
	public void save(Opportunity theOpp) {
		// TODO Auto-generated method stub
		opportunityRepository.save(theOpp);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		opportunityRepository.deleteById(theId);
	}

}
