package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.Supplier;
import com.niit.project2.DAO.SupplierDAO;
@Repository("supplierDAOImpl")
public class SupplierDAOImpl implements SupplierDAO {
@Autowired
private Supplier supplier;
@Autowired
SupplierDAO supplierDAOImpl;
@Autowired
private SessionFactory sessionFactory;

public SupplierDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
@Transactional
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
		
	}
@Transactional
	public boolean update(Supplier supplier) {
		
	try {
		
		sessionFactory.getCurrentSession().update(supplier);
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
	}
@Transactional
	public boolean delete(Supplier supplier) {
		
	try {
		sessionFactory.getCurrentSession().delete(supplier);
		return true;
	} catch (HibernateException e) {
		
		e.printStackTrace();
		return false;
	}
	
	}
@Transactional
	@SuppressWarnings("null")
	public Supplier get(String supplierid) {
		String hql = "from Supplier where supplierid = '" + supplierid +"'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Supplier> list =query.list();
		
		if(list !=null || list.isEmpty())
		{
			return null;
		}
		return list.get(0);
	}
@Transactional
	public List<Supplier> list() {
		return null;
	}
@Transactional
	public boolean delete(String supplierid) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}}
}


