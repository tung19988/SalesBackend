package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entyti.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Integer> {

}
