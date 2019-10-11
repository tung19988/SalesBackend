package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entyti.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
