package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entyti.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
