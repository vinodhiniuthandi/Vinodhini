package com.niit.project2.DAO;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.BillingAddress;
import com.niit.project2.DAO.BillingAddressDAO;

	@Repository("billingAddressDAOImpl")
	@Transactional
	public class BillingAddressDAOImpl implements BillingAddressDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	BillingAddressDAO billingAddressDAOImpl;
	@Autowired
	BillingAddress billingaddress;

	public BillingAddressDAOImpl (SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
		public void deleteBillingAddress(String BillingAddressid) {
		try
		{
		sessionFactory.getCurrentSession().delete(BillingAddressid);
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		}
		
	}

	@Transactional
		public BillingAddress getBillingAddress(String BillingAddressid) {
	String hql=" from BillingAddress where BillingAddressid= "+"'"+BillingAddressid+"'";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<BillingAddress> list= query.list();
		
		if(list==null)
		{
			return null;
		}
		else
		{
			return list.get(0);
		}		}
	@Transactional
		public void saveOrUpdate(BillingAddress billingAddress) {
			
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		
		}
		}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<BillingAddress> list() {
		String hql="from BillingAddress";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}
	@Transactional
	public void save(BillingAddress billingAddress) {

		try
		{
		sessionFactory.getCurrentSession().save(billingAddress);
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		}
	}
	}

