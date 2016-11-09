package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.CartItemDAO;
import com.niit.project2.Model.CartItem;

public class CartItemTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		CartItemDAO cartItemDAO= (CartItemDAO) context.getBean("cartItemDAOImpl");
		CartItem cartItem = (CartItem) context.getBean("cartItem");
	cartItem.setCartid("C001");
	cartItem.setCartItemid("CI001");
	cartItem.setCustomerid("CS001");
	cartItem.setProductid("PD001");
	cartItem.setQuantity(4);
	cartItem.setTotalPrice(160000);
	 cartItemDAO.save(cartItem);
		 System.out.println( "Details are created successfully");
	}}
