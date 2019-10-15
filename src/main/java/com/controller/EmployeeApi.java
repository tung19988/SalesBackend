package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.entyti.Employee;

@RestController
@RequestMapping(value =  "/Employee")
public class EmployeeApi {
	
	@Autowired
	private EmployeeDao emDao;

	
	@RequestMapping(value =  "/list")
	public List<Employee> getAllDe() {
		 return emDao.findAll();
		 
	}
}
