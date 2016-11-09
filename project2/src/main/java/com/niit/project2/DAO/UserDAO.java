package com.niit.project2.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.project2.Model.User;
@Repository
public interface UserDAO {

	public User get(String userid);
	public void save(User user);
	public void saveOrUpdate(User  user);
	public List<User> list();
	public void delete(String userid);
	public User isValidUser(String userid,String password);
	}

