package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entyti.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e WHERE e.nameEmpl=?1")
	List<Employee> nameE(String name);
}
