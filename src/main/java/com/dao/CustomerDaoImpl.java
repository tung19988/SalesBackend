package com.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.entyti.Customer;
import com.service.CustomerRepository;
import com.service.WorkkRepository;
import com.util.HibernateUtil;
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public List<Customer> find() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			String hql = "FROM Customer c WHERE c.idCus='1'";
			Query query = session.createQuery(hql);
			List results = query.list();
//			List list = session.createQuery("from Employee where id= 1").list();
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


}
