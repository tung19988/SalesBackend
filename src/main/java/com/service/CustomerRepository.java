package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entyti.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
