package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.OrderDetailDAO;
import com.niit.project2.Model.OrderDetail;
public class OrderDetailTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		OrderDetailDAO orderDetailDAO= (OrderDetailDAO) context.getBean("orderDetailDAOImpl");
		OrderDetail orderDetail = (OrderDetail) context.getBean("orderDetail");
	 orderDetail.setShippingAddressid("SA001");
	 orderDetail.setBillingAddressid("BA002");
	 orderDetail.setGrandTotal("160000");
	 orderDetail.setCustomerid("CS001");
	 orderDetail.setOrderDetailid("ODI001");
	 orderDetailDAO.save(orderDetail);
		 System.out.println( "Details are created successfully");
	}

	}
