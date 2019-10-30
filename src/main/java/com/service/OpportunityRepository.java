package com.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.entyti.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Integer> {
	
	@Query("SELECT COUNT(o) FROM Opportunity o WHERE o.stt=?1")
	Optional<Integer> selectStt(String stt);
}
//SELECT COUNT(ProductID) AS NumberOfProducts FROM Products;