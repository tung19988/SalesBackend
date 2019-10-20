package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entyti.Employee;
import com.service.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

private EmployeeRepository empRespons;
	
	
	@Autowired
	public EmployeeDaoImpl(EmployeeRepository empRespons) {
		super();
		this.empRespons = empRespons;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empRespons.findAll();
	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return empRespons.findById(id);
	}

	@Override
	public void save(Employee de) {
		// TODO Auto-generated method stub
		empRespons.save(de);
	}

	@Override
	public void delete(Employee de) {
		// TODO Auto-generated method stub
		empRespons.delete(de);
	}

}
