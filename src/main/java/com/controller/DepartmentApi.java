package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DepartmentDao;
import com.entyti.Department;


@RestController
@RequestMapping(value =  "/department")
public class DepartmentApi {
	
	@Autowired
	private DepartmentDao deDao;

	
	@RequestMapping(value =  "/list")
	public List<Department> getAllDe() {
		 return deDao.findAll();
		 
	}
}
