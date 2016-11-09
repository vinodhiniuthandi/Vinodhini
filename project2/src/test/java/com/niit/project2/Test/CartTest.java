package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.CartDAO;
import com.niit.project2.Model.Cart;
public class CartTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		CartDAO cartDAO= (CartDAO) context.getBean("cartDAOImpl");
		Cart cart= (Cart) context.getBean("cart");
		cart.setCartid("C001");
		cart.setCustomerid("CS001");
		cart.setOrderedItemid("OI001");
	cart.setGrandTotal("160000");
	cart.setNoOfProducts(4);
	 cartDAO.save(cart);

	    
		 System.out.println( "Details are created successfully");
	}

	}

