package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.Cart;
import com.niit.project2.DAO.CartDAO;
import com.niit.project2.Model.OrderedItem;
@Repository("cartDAOImpl")
@Transactional
public class CartDAOImpl implements CartDAO {
@Autowired
private SessionFactory sessionFactory;
@Autowired
Cart cart;
@Autowired
CartDAO cartDAOImpl;

public CartDAOImpl(SessionFactory sessionFactory)

{
	this.sessionFactory=sessionFactory;
}

@Transactional
	public void saveOrUpdate(Cart cart) {
	try
	{
	sessionFactory.getCurrentSession().saveOrUpdate(cart);

	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	}
		
	}

@Transactional
	public void delete(String cartid) {
	try
	{
	sessionFactory.getCurrentSession().delete(cartid);

	}
	catch(HibernateException e)
	{
	e.printStackTrace();	
	}
		
	}

@Transactional
	public Cart getCartByCustomerid(String customerid) {
	String hql = "from Cart where customerid=" + "'" + customerid + "'";
	
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
			
	@SuppressWarnings("unchecked")
	List<Cart> customerList = query.list();
			
	if (customerList != null && !customerList.isEmpty())
	{	
	return customerList.get(0);
	}else{
			
	return null;
	}
	}
@Transactional
	public List<Cart> list() {
		String hql = "from Cart";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
				
		@SuppressWarnings("unchecked")
		List<Cart> listOfCart = query.list();
				
		return listOfCart;


	}
@Transactional
	public List<OrderedItem> listOrderedItem(String customerid) {
		String hql = "from OrderedItems where customerid="+"'"+customerid+"'";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
				
		@SuppressWarnings("unchecked")
		List<OrderedItem> listOfOrderedItem = query.list();
				
		return listOfOrderedItem;
			}
@Transactional
	public void save(Cart cart) {
		try
		{
		sessionFactory.getCurrentSession().save(cart);

		}
		catch(HibernateException e)
		{
		e.printStackTrace();	
		}
			
		}

public Cart get(String cartid) {
	// TODO Auto-generated method stub
	return null;
}
	}


