package com.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entyti.Employee;
import com.service.EmployeeRepository;
import com.util.HibernateUtil;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

private EmployeeRepository empRespons;
	
	
	@Autowired
	public EmployeeDaoImpl(EmployeeRepository empRespons) {
		super();
		this.empRespons = empRespons;
	}

	@Override
	public List<Employee> findAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
	    try {
	      session.beginTransaction();
	      String hql = " SELECT d.level FROM Employee e , Decentraliza d WHERE e.idEmpl=d.idEmpl";
	      Query query = session.createQuery(hql);
	      List results = query.list();
//	      List list = session.createQuery("from Employee where id= 1").list();
	      session.getTransaction().commit();
	      session.close();
	      return results;
	    } catch (Exception e) {
	      e.printStackTrace();
	      session.getTransaction().rollback();
	      session.close();
	    }
	    return null;
	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return empRespons.findById(id);
	}

	@Override
	public void save(Employee de) {
		// TODO Auto-generated method stub
		empRespons.save(de);
	}

	@Override
	public void delete(Employee de) {
		// TODO Auto-generated method stub
		empRespons.delete(de);
	}

}
