package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.UserDAO;
import com.niit.project2.Model.User;

public class UserTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
        UserDAO userDAO= (UserDAO) context.getBean("userDAOImpl");
        User user = (User) context.getBean("user");
      user.setUserid("vino@gmail.com");
      user.setName("vinodh");
      user.setPassword("12345");
      user.setMobile("123456789");
      user.setRole("User");
      user.setAddress("chidambaram");
    userDAO.save(user);
    
        
		 System.out.println( "Details are created successfully");
	}

}