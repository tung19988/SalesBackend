package com.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.entyti.Customer;
import com.entyti.Workk;
import com.service.WorkkRepository;
import com.util.HibernateUtil;

public class WorkkDaoImpl implements WorkkDao {

	public List<Workk> find() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			String hql = "FROM Workk c WHERE c.workName='a'";
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
