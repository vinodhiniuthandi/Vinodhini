package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.Product;
import com.niit.project2.DAO.ProductDAO;

@Repository("productDAOImpl")
public class ProductDAOImpl implements ProductDAO{
	@SuppressWarnings("unused")
	@Autowired
	
	private Product product;
	@Autowired
	ProductDAO productDAOImpl;
	
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl (SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean save(Product product) {
		
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	public boolean delete(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	@SuppressWarnings("null")
	public Product get(String productid) {
		String hql = "from Product where productid = '" + productid +"'";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Product> list =query.list();
		
		if(list !=null || list.isEmpty())
		{
			return null;
		}
		return list.get(0);
	}
@Transactional
	public List<Product> list() {
		
		return null;
	}
@Transactional
	public boolean delete(String productid) {
		
		try {
			sessionFactory.getCurrentSession().delete(productid);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}}
}


