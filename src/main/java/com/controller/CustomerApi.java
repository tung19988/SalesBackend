package com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDaoImpl;

import com.entyti.Customer;
import com.entyti.Opportunity;
import com.service.CustomerRepository;



@RestController
public class CustomerApi {
	
@Autowired
CustomerRepository cus;

@RequestMapping(value = "/cus/list", method = RequestMethod.GET)
public List<Customer> list (){
	return cus.findAll();
}
@RequestMapping(value = "/cus/list", method = RequestMethod.POST)
public List<Customer> addCustomer(@Valid @RequestBody List<Customer> Customer) {
    return  cus.saveAll(Customer);
}

@RequestMapping(value = "/cus/list/{id}", method = RequestMethod.GET)
public Optional<Customer> getById(@PathVariable(value = "id") Integer CusId) {
    return cus.findById(CusId); 
}
@RequestMapping(value = "/cus/list/{id}", method = RequestMethod.PUT)
public Customer update(@PathVariable Integer id,@Valid @RequestBody Customer cuss) {
	  return cus.save(cuss); 
}
@RequestMapping(value = "/cus/list/{id}", method = RequestMethod.DELETE)
public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
	    return cus.findById(id).map(record -> {
	    	cus.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	}

@RequestMapping(value = "/list1", method = RequestMethod.GET)
public List<Customer> listEmpl() {
	List<Customer> theEmployees= new CustomerDaoImpl().find();
	return theEmployees;
	}
}
