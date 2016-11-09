package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.Category;
@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
@SuppressWarnings("unused")
@Autowired
private Category category;
@Autowired
CategoryDAO categoryDAOImpl;
@Autowired
private SessionFactory sessionFactory;

public CategoryDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory = sessionFactory;
}
 @Transactional
public boolean save(Category category) {

	try
	{
	sessionFactory.getCurrentSession().save(category);
	return true;
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	return false;
	}
	
}
 @Transactional
public boolean update(Category category) {
	
	try
	{
	sessionFactory.getCurrentSession().update(category);
	return true;
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	return false;
	}
	
}
	
 @Transactional
public boolean delete(String categoryid) {
	try
	{
	sessionFactory.getCurrentSession().delete(categoryid);
	return true;
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	return false;
	}
	
}

@Transactional
public Category get(String categoryid) {

	//select * from category where id='101';
	String hql=" from Category where categoryid= "+"'"+categoryid+"'";
	
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Category> list= query.list();
	
	if(list==null)
	{
		return null;
	}
	else
	{
		return list.get(0);
	}
}

@SuppressWarnings("unchecked")
@Transactional
public List<Category> list() {
	{
		
		String hql="from Category";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
		
	}

}
}


