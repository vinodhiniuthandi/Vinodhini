package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.ShippingAddress;
import com.niit.project2.DAO.ShippingAddressDAO;

@Repository("shippingAddressDAOImpl")
public class ShippingAddressDAOImpl implements ShippingAddressDAO {
	
	@SuppressWarnings("unused")
	@Autowired
	private ShippingAddress shippingAddress;
	@Autowired
	ShippingAddressDAO shippingAddressDAOImpl;

	@Autowired
	private SessionFactory sessionFactory;
	
	public ShippingAddressDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public void saveOrUpdate(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAddress);
		
	}
@Transactional
	public void deleteShippingAddress(String ShippingAddressid) {
		ShippingAddress shippingAddressToDelete = new ShippingAddress();
		
		shippingAddressToDelete.setShippingAddressid(ShippingAddressid);
			
		sessionFactory.getCurrentSession().delete(shippingAddressToDelete);

			
		
	}
@Transactional
	public ShippingAddress getShippingAddress(String ShippingAddressid) {
		
		return (ShippingAddress) sessionFactory.getCurrentSession().get(ShippingAddress.class, ShippingAddressid);
		
	}
@Transactional
public List<ShippingAddress> list() {
	// TODO Auto-generated method stub
	return null;
}
@Transactional
public void save(ShippingAddress shippingAddress) {
	try {
		sessionFactory.getCurrentSession().save(shippingAddress);

	} catch (HibernateException e) {
		
		e.printStackTrace();
	
	}}
	
}



