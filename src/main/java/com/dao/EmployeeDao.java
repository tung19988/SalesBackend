package com.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.entyti.Employee;

@Service
public interface EmployeeDao {
	public List<Employee> findAll() ;
	public Optional<Employee> findById(int id) ;
	public void save(Employee de) ;
	public void delete(Employee de) ;
}
