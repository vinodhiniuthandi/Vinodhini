package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.OrderedItem;
import com.niit.project2.DAO.OrderedItemDAO;

@Repository("orderedItemDAOImpl")
public class OrderedItemDAOImpl implements OrderedItemDAO {
	
	@Autowired
	
	private SessionFactory sessionFactory;
	@Autowired
	OrderedItem orderedItem;
	@Autowired
	OrderedItemDAO orderedItemDAOImpl;
	public  OrderedItemDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
@Transactional
	public void saveOrUpdate(OrderedItem orderedItem) {
		
	try
	{
	sessionFactory.getCurrentSession().save(orderedItem);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	}
	}
@Transactional
	public void delete(String orderedItemid) {
		
	try
	{
	sessionFactory.getCurrentSession().delete(orderedItemid);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	

	}
	}
@SuppressWarnings("unchecked")
@Transactional
	public List<OrderedItem> listOrderedItem(String customerid) {
		
	String hql = "from OrderedItems where customerid="+"'"+customerid+"'";
	
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
			
	List<OrderedItem> listOfOrderedItem = query.list();
			
	return listOfOrderedItem;
		}
	
	
@Transactional
	public OrderedItem getOrderedItem(String OrderedItemid) {
String hql=" from OrderedItem where OrderedItemid= "+"'"+OrderedItemid+"'";
	
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<OrderedItem> list= query.list();
	
	if(list==null)
	{
		return null;
	}
	else
	{
		return list.get(0);
	}		}
	
@Transactional
public void save(OrderedItem orderedItem) {
	try
	{
	sessionFactory.getCurrentSession().save(orderedItem);

	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	}
		
	}

@SuppressWarnings("unchecked")
@Transactional
public List<OrderedItem> list() {

	String hql="from OrderedItem";
	
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	return query.list();
	

}}
