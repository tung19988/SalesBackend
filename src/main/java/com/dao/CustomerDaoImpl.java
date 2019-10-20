package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.entyti.Customer;
import com.service.CustomerRepository;
import com.service.WorkkRepository;

public class CustomerDaoImpl implements CustomerDao {
private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerDaoImpl(CustomerRepository theCustomerRepository) {
		customerRepository = theCustomerRepository;
	}
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Customer> findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Customer theCustomer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
