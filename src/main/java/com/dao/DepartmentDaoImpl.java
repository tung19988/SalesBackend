package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entyti.Department;
import com.service.DepartmentRepository;

@Service
public class DepartmentDaoImpl implements DepartmentDao {

	private DepartmentRepository departRespons;
	
	@Autowired
	public DepartmentDaoImpl(DepartmentRepository departRespons) {
		super();
		this.departRespons = departRespons;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return departRespons.findAll();
	}

	@Override
	public Optional<Department> findById(int id) {
		// TODO Auto-generated method stub
		return departRespons.findById(id);
	}

	@Override
	public void save(Department de) {
		// TODO Auto-generated method stub
		departRespons.save(de);
	}

	@Override
	public void delete(Department de) {
		// TODO Auto-generated method stub
		departRespons.delete(de);
	}

}
