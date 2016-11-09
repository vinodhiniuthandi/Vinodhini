package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.Customer;
import com.niit.project2.DAO.CustomerDAO;
@Repository("customerDAOImpl")

public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	
	private SessionFactory sessionFactory;
	@Autowired
	Customer customer;
	@Autowired
	CustomerDAO customerDAOImpl;
	
	public CustomerDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
		}

		
@Transactional
	public void saveOrUpdate(Customer customer) {
	try
	{
	sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	
	}

	}
@Transactional
	public Customer get(String customerid) {
		
String hql=" from Customer where customerid= "+"'"+customerid+"'";
	
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Customer> list= query.list();
	
	if(list==null)
	{
		return null;
	}
	else
	{
		return list.get(0);
	}		
		
	}

@Transactional

	public void delete(String customerid) {
		try
		{
		sessionFactory.getCurrentSession().delete(customerid);
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		
		}
		
		
	}

   @Transactional
	public void save(Customer customer) {
		try
		{
		sessionFactory.getCurrentSession().save(customer);
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		
		}
		
	}

@Transactional
public List<Customer> list() {
	// TODO Auto-generated method stub
	return null;
}

@Transactional
public Customer getCustomerByUserName(String name) {
	// TODO Auto-generated method stub
	return null;
}

}
