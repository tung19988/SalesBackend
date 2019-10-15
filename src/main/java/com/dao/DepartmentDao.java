package com.dao;

import java.util.List;
import java.util.Optional;

import com.entyti.Department;

public interface DepartmentDao {
	public List<Department> findAll();
	public Optional<Department> findById(int theId);
	public void save(Department theWorkk);
	public void deleteById(int theId);
}
