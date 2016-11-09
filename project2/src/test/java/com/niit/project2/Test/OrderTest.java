package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.project2.DAO.OrderDAO;
import com.niit.project2.Model.BillingAddress;
import com.niit.project2.Model.Cart;
import com.niit.project2.Model.Order;
import com.niit.project2.Model.ShippingAddress;


public class OrderTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		OrderDAO orderDAO= (OrderDAO) context.getBean("orderDAOImpl");
		Order order = (Order) context.getBean("order");
		BillingAddress billingAddress = null ;
		order.setBillingAddress(billingAddress);
		order.setOrderid("O001");
		order.setPaymentMethod("cashondelivery");
		Cart cart = null;
		order.setCart(cart);
		ShippingAddress shippingAddress = null;
		order.setShippingAddress(shippingAddress);
		order.setTotalAmount(40000);
		order.setUserid("vino@gmail.com");
		
      orderDAO.save(order);
    
        
		 System.out.println( "Details are created successfully");
	}

}
