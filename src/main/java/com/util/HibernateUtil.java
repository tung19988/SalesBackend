package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entyti.Commentt;
import com.entyti.Customer;
import com.entyti.Decentraliza;
import com.entyti.Department;
import com.entyti.Employee;
import com.entyti.Opportunity;
import com.entyti.Workk;

import java.util.Properties;

public class HibernateUtil {
	 private static SessionFactory sessionFactory;
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                Configuration configuration = new Configuration();
	                // Hibernate settings equivalent to hibernate.cfg.xml's properties
	                Properties settings = new Properties();
	                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/db_sale?useSSL=false&serverTimezone=UTC");
	                settings.put(Environment.USER, "root");
	                settings.put(Environment.PASS,"");
	                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
	                settings.put(Environment.SHOW_SQL, "true");
	                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//	                settings.put(Environment.HBM2DDL_AUTO, "create-drop");

	                configuration.setProperties(settings);
	                configuration.addAnnotatedClass(Workk.class);
	                configuration.addAnnotatedClass(Commentt.class);
	                configuration.addAnnotatedClass(Opportunity.class);
	                configuration.addAnnotatedClass(Employee.class);
	                configuration.addAnnotatedClass(Department.class);
	                configuration.addAnnotatedClass(Decentraliza.class);
	                configuration.addAnnotatedClass(Customer.class);
	                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties()).build();
	                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return sessionFactory;
	    }
}