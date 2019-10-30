package com.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.entyti.Workk;
import com.util.HibernateUtil;

public class WorkkDaoImpl implements WorkkDao {

	public Object findidd(int  idWork) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
//		try {
			session.beginTransaction();
			String hql = "SELECT statuss,prioritize,idDepartment FROM Workk  Where idWork= :idWork";
			Query query = session.createQuery(hql);
		
//			List list = session.createQuery("from Employee where id= 1").list();
			 query.setParameter("idWork", idWork);
//			List results = query.list();
//			Object  p  =query.uniqueResult();
//			Workk w = (Workk) p;
			session.getTransaction().commit();
			session.close();
			return   query;
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//			session.close();
//		}
//		return null;
	}


}
