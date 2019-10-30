package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import com.entyti.Decentraliza;
import com.util.HibernateUtil;

@Service
public class DecentralizaDaoImpl implements DecentralizaDao {

	@Override
	public List<Decentraliza> find() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			String hql = "SELECT e.userr, d.levell FROM Employee e , Decentraliza d WHERE e.idEmpl=d.idEmpl";
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
