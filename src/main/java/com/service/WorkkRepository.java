package com.service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.entyti.Workk;

public interface WorkkRepository extends JpaRepository<Workk, Integer> {

//	 @Query("SELECT w FROM Workk  w  where  w.idEmpl.idEmpl= ?1 ")
//	 List<Workk>  findTitleById(Integer id);
}
