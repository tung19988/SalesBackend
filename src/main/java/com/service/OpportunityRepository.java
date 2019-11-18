package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entyti.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Integer> {
	
	//tổng doanh thu của nhân viên
	//@Query( value = "SELECT e.id_empl, e.name_empl, SUM(total_money) as SUM_Luong FROM opportunity o, employee e WHERE o.id_empl=?1 and e.id_empl=o.id_empl;", nativeQuery = true)
	@Query( "SELECT o.cusName FROM Opportunity o ")
	List<Opportunity> totalRevenue();
}
//SELECT COUNT(ProductID) AS NumberOfProducts FROM Products;