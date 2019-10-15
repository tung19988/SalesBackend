package com.dao;

import java.util.List;
import java.util.Optional;

import com.entyti.Opportunity;


public interface OpportunityDao {
	public List<Opportunity> findAll();
	public Optional<Opportunity> findById(int theId);
	public void save(Opportunity theOpp);
	public void deleteById(int theId);
}
