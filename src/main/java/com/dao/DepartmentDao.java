package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.entyti.Department;


@Service
public interface DepartmentDao {
	public List<Department> findAll() ;
	public Optional<Department> findById(int id) ;
	public void save(Department de) ;
	public void delete(Department de) ;
	
}
