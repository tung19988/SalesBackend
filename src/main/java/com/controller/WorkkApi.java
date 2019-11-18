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


import com.dao.WorkkDaoImpl;
import com.entyti.Department;
import com.entyti.Employee;
import com.entyti.Workk;
import com.service.WorkkRepository;

@RestController

public class WorkkApi {

  @Autowired
  WorkkRepository workk;
  
  @RequestMapping(value = "/workk/list", method = RequestMethod.GET)
	public List<Workk> list() {	  
		return workk.findAll();
}
  @RequestMapping(value = "/workk/list", method = RequestMethod.POST)
  public Workk add(@Valid @RequestBody Workk work) {
      return  workk.save(work);
  }
  @RequestMapping(value = "/workk/list/{id}", method = RequestMethod.GET)
  public Optional<Workk> getById(@PathVariable(value = "id") Integer WorkkId) {
      return workk.findById(WorkkId); 
  }
  @RequestMapping(value = "/workk/list/{id}", method = RequestMethod.PUT)
  public Workk update(@PathVariable Integer id,@Valid @RequestBody Workk work) {
	  return workk.save(work); 
  }
  
  @RequestMapping(value = "/workk/list/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deleteid(@PathVariable("id") Integer id) {
	    return workk.findById(id).map(record -> {
	    	workk.deleteById(id);
	            return ResponseEntity.ok().build();
	        }).orElse(ResponseEntity.notFound().build());
	}
  @RequestMapping(value = "/work/list/{id}", method = RequestMethod.GET)
  public Object getId(@PathVariable(value = "id") Integer WorkkId) {
	  Object  theWorkk= new WorkkDaoImpl().findidd(WorkkId);	
	return  theWorkk;
  }
<<<<<<< HEAD
//trưởng phòng Xem được công việc của phòng ban nó
  @RequestMapping(value = "/workk/vw1/{id}", method = RequestMethod.GET)
  public List<Workk> managerVW(@PathVariable(value = "id") Department id) {
      return workk.managerViewWork(id); 
  }
  
  //Nhân viên thì xem được công việc của từng nhân viên đó
  @RequestMapping(value = "/workk/vw2/{id}", method = RequestMethod.GET)
  public List<Workk> emplVW(@PathVariable(value = "id") Employee id) {
      return workk.emplViewWork(id); 
=======
//  @RequestMapping(value = "/workk/lis/{id}", method = RequestMethod.GET)
//  public List<Workk> getByI(@PathVariable(value = "id") Integer id) {
//      return workk.findTitleById(id); 
//}
>>>>>>> 0bb2606b83d087b02d3af6638179d3d82b6f7858
  }
  
  //admin,truongphong xem việc đã giao 
  @RequestMapping(value = "/workk/ww/{id}", method = RequestMethod.GET)
  public List<Workk> adWW(@PathVariable(value = "id") Employee id) {
      return workk.adminWatchWork(id); 
  }
  
}
