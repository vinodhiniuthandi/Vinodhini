package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.OrderDetail;
import com.niit.project2.DAO.OrderDetailDAO;


@Repository("orderDetailDAOImpl")
@Transactional
public class OrderDetailDAOImpl implements OrderDetailDAO {
	
	@Autowired
	
	private SessionFactory sessionFactory;
	@Autowired
	OrderDetail orderDetail;
	@Autowired
	OrderDetailDAO orderDetailDAOImpl;
	public  OrderDetailDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
@Transactional
	public void saveOrUpdate(OrderDetail orderDetail) {
		
	try
	{
	sessionFactory.getCurrentSession().save(orderDetail);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	}
	}
@Transactional
	public void delete(String orderDetailid) {
		
	try
	{
	sessionFactory.getCurrentSession().delete(orderDetailid);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	

	}
	}
@Transactional
	public OrderDetail getOrderDetail(String OrderDetailid) {
		// TODO Auto-generated method stub
		return null;
	}
@Transactional
public void save(OrderDetail orderDetail) {
	// TODO Auto-generated method stub
	try
	{
	sessionFactory.getCurrentSession().save(orderDetail);
	}
	catch(HibernateException e)
	{
	e.printStackTrace();	

}
}
@Transactional
public List<OrderDetail> list() {
	// TODO Auto-generated method stub
	return null;
}}
