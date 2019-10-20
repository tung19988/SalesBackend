package com.dao;

import java.util.List;
import java.util.Optional;

import com.entyti.Customer;



public interface CustomerDao {
	public List<Customer> findAll();
	public Optional<Customer> findById(int theId);
	public void save(Customer theCustomer);
	public void deleteById(int theId);
}
