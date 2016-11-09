package com.niit.project2.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.project2.Model.User;
import com.niit.project2.DAO.UserDAO;

@Repository("userDAOImpl")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private User user;
	@Autowired
	UserDAO userDAOImpl;
@Autowired
private SessionFactory sessionFactory;

public UserDAOImpl (SessionFactory sessionFactory)
{
this.sessionFactory=sessionFactory;	
}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> list() {
	String hql = "from User";
	Query query =sessionFactory.getCurrentSession().createQuery(hql);
	return query.list();
	}
@Transactional
	public User get(String userid) {
		String hql = "from User where userid="+"'"+ userid+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>)query.list();
		if(list!=null&&!list.isEmpty())
		{
			return list.get(0);
		}
		return null;
	}
@Transactional
	public void saveOrUpdate(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		
		
	}
@Transactional
	public void delete(String userid) {
	
		try {
			sessionFactory.getCurrentSession().delete(user);
		} catch (HibernateException e) 
		{
			e.printStackTrace();
		}
		
	}
@Transactional
	public User isValidUser(String userid ,String password)
	{
		@SuppressWarnings("unused")
		String hql = "from User where userid="+"'"+userid+"'"+"and"+"password="+"'"+password+"'";
		return user ;
		
	}
@Transactional
public void save(User user) {
	try {
		sessionFactory.getCurrentSession().save(user);
	} catch (HibernateException e) {
		e.printStackTrace();
	}
	
}

	
}


