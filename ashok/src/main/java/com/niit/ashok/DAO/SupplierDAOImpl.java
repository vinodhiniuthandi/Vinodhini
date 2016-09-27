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
import com.niit.ashok.model.Supplier;
@EnableTransactionManagement
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO{
@Autowired
private Supplier supplier;
@Autowired
private SessionFactory sessionfactory;
public SupplierDAOImpl(SessionFactory sessionFactory){
	this.sessionfactory=sessionFactory;
}
@Transactional
public boolean save(Supplier supplier) {
	try{
		sessionfactory.getCurrentSession().save(supplier);
		return true;
	}catch(HibernateException e){
		
	e.printStackTrace();
	return false;}
	
}
@Transactional
public boolean update(Supplier supplier) {
	try{
		sessionfactory.getCurrentSession().update(supplier);
		return true;
	}catch(HibernateException e){
		
	e.printStackTrace();
	return false;}
}
@Transactional
public boolean delete(String id) {
	try{
		sessionfactory.getCurrentSession().delete(get(id));
		return true;
	}catch(HibernateException e){
		
	e.printStackTrace();
	return false;}

}
public Supplier get(String id) {
	String hql="from Supplier where id='"+id+"'";
	
	Query query=sessionfactory.getCurrentSession().createQuery(hql);
	List<Supplier> list=query.list();
	if(list==null ||list.isEmpty())
	{
		return null;
	
	}
	return list.get(0);

}
public List<Supplier> list() {
	return null;
}

}
