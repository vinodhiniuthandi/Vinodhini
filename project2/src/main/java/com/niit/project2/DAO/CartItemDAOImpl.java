package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.CartItem;
import com.niit.project2.DAO.CartItemDAO;

@Repository("cartItemDAOImpl")
@Transactional
public class CartItemDAOImpl implements CartItemDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	CartItem cartItem;
	@Autowired
	CartItemDAO cartItemDAOImpl;

	public CartItemDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
		public void saveOrUpdate(CartItem cartItem) {
			sessionFactory.getCurrentSession().saveOrUpdate(cartItem);
		}
@Transactional
		public void delete(String cartItemid) {
			CartItem cartItemToDelete = new CartItem();
			
			cartItemToDelete.setCartItemid(cartItemid);
					
			sessionFactory.getCurrentSession().delete(cartItemToDelete);
				
			
		}
@Transactional
		public CartItem getCartItem(String cartItemid) {
			String hql = "from CartItem where cartItemid=" + "'" + cartItemid + "'";
			
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
					
			@SuppressWarnings("unchecked")
			List<CartItem> cartItemList = query.list();
					
			if(cartItemList!=null && !cartItemList.isEmpty())
						
			return cartItemList.get(0);
					
			return null;
				
		}
@Transactional
		public List<CartItem> getCartItemByCustomerid(String customerid) {
			String hql = "from CartItem where customerid=" + "'" + customerid + "'";
			
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
					
			@SuppressWarnings("unchecked")
			List<CartItem> listOfCartItem = query.list();
					
			return listOfCartItem;
				}

				
		
@Transactional
		public List<CartItem> list() {
			String hql = "from CartItem";
			
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
					
			@SuppressWarnings("unchecked")
			List<CartItem> cartItem = query.list();
					
			return cartItem;

				}
@Transactional
		public void save(CartItem cartItem) {
			
			try
			{
			sessionFactory.getCurrentSession().save(cartItem);

			}
			catch(HibernateException e)
			{
			e.printStackTrace();	
			}
			
		}
		
	}


