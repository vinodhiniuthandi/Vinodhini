package com.niit.project2.DAO;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.CardDetail;
import com.niit.project2.Model.Category;
import com.niit.project2.DAO.CardDetailDAO;
@Repository("cardDetailDAOImpl")
@Transactional
public class CardDetailDAOImpl implements CardDetailDAO {
@Autowired
private SessionFactory sessionFactory;
@Autowired
CardDetail cardDetail;
@Autowired
CardDetailDAO cardDetailDAOImpl;
public CardDetailDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
	
}
	@Transactional
	public void saveOrUpdate(CardDetail cardDetail) {
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(cardDetail);
		}
		catch(HibernateException e)
		{
		e.printStackTrace();
		}
		
	}
	@Transactional
	public void delete(String cardDetailId) {
		try
		{
		sessionFactory.getCurrentSession().delete(cardDetailId);
		}
		catch(HibernateException e)
		{
		e.printStackTrace();	

		}
		
	}
	@Transactional
	public Category getCardDetailByCustomerid(String customerid) {
		
		String hql=" from Category where customerid= "+"'"+customerid+"'";
		
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
	
@Transactional
	public void save(CardDetail cardDetail) {
	
	try
	{
	sessionFactory.getCurrentSession().save(cardDetail);
	return;
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	return;
	}
	}
@Transactional
@SuppressWarnings("unchecked")
public List<CardDetail> list() {
String hql="from CardDetail";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
}

}

