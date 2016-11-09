package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.DAO.OrderDAO;
import com.niit.project2.Model.Order;

@Repository("orderDAOImpl")
@Transactional
public class OrderDAOImpl implements OrderDAO {
	
	@Autowired
	
	private SessionFactory sessionFactory;
	@Autowired
	Order order;
	@Autowired
	OrderDAO orderDAOImpl;
	public  OrderDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
@Transactional
	public void saveOrUpdate(Order order) {
		
	try
	{
	sessionFactory.getCurrentSession().save(order);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	}
	}
@Transactional
	public void delete(String orderid) {
		
	try
	{
	sessionFactory.getCurrentSession().delete(orderid);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	

	}
	}
@Transactional
	public Order getOrder(String Orderid) {
		// TODO Auto-generated method stub
		return null;
	}
@Transactional
public void save(Order order) {
	// TODO Auto-generated method stub
	try
	{
	sessionFactory.getCurrentSession().save(order);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	

}
}
@Transactional
public List<Order> list() {
	// TODO Auto-generated method stub
	return null;
}}
