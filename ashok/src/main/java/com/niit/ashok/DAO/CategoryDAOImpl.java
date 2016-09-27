package com.niit.ashok.DAO;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ashok.model.Category;

@EnableTransactionManagement
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
@Autowired
	private Category category;

@Autowired
	private SessionFactory sessionfactory;
public CategoryDAOImpl(SessionFactory sessionfactory)
{
	this.sessionfactory=sessionfactory;
	
}
@Transactional
	public boolean save(Category category) {
		try{
		sessionfactory.getCurrentSession().save(category);
		return true;
		}
		catch(HibernateException e){
			e.printStackTrace();
		return false;
	} 

	}
   @Transactional
	public boolean update(Category category) {
		try{
			sessionfactory.getCurrentSession().update(category);
			return true;	
		}
			catch(HibernateException e){
				e.printStackTrace();
			return false;
		} 
	}
   @Transactional
	public boolean delete (String id) {
		try{
			sessionfactory.getCurrentSession().delete(get(id));
			return true;	
		}
			catch(HibernateException e){
				e.printStackTrace();
			return false;
		}

	}



	public Category get(String id) {
		//Select* from Category where id='id'
		String hql="from Category where id='"+id+"'";
	
		Query query=sessionfactory.getCurrentSession().createQuery(hql);
		List<Category> list=query.list();
		if(list==null ||list.isEmpty())
		{
			return null;
		
		}
		return list.get(0);
	}
	public List<Category> list() {
	
		return null;
	}
}
