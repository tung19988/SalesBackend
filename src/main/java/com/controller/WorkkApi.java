package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.entyti.Workk;
import com.service.WorkkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@RestController

public class WorkkApi {

  @Autowired
  WorkkRepository workk;
  
  @RequestMapping(value = "/workk/list", method = RequestMethod.GET)
	public List<Workk> listWorkk() {	  
		return workk.findAll();
}
  @RequestMapping(value = "/workk/list", method = RequestMethod.POST)
  public Workk addWorkk(@Valid @RequestBody Workk work) {
      return  workk.save(work);
  }
	}
