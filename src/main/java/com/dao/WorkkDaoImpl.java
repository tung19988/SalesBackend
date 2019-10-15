package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.entyti.Workk;
import com.service.WorkkRepository;

public class WorkkDaoImpl implements WorkkDao {
private WorkkRepository workkRepository;
	
	@Autowired
	public WorkkDaoImpl(WorkkRepository theWorkkRepository) {
		workkRepository = theWorkkRepository;
	}
	@Override
	public List<Workk> findAll() {
		// TODO Auto-generated method stub
		return workkRepository.findAll();
	}

	@Override
	public Optional<Workk> findById(int theId) {
		// TODO Auto-generated method stub
		return workkRepository.findById(theId);
	}

	@Override
	public void save(Workk theWorkk) {
		// TODO Auto-generated method stub
		workkRepository.save(theWorkk);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		workkRepository.deleteById(theId);
	}

}
