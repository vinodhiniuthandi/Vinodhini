package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.ShippingAddressDAO;
import com.niit.project2.Model.ShippingAddress;


public class ShippingAddressTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		ShippingAddressDAO shippingAddressDAO = (ShippingAddressDAO) context.getBean("shippingAddressDAOImpl");
		ShippingAddress shippingAddress = (ShippingAddress) context.getBean("shippingAddress");
		shippingAddress.setCustomerid("CS001");
		shippingAddress.setLine1("chidambaram");
		shippingAddress.setLine2("cdm");
		shippingAddress.setShippingAddressid("SA001");
		shippingAddress.setState("Tamilnadu");
		shippingAddress.setCity("chennai");
		shippingAddress.setCountry("India");
		shippingAddress.setZipcode("608401");
		
		shippingAddressDAO.save(shippingAddress);

	    
		 System.out.println( "Details are created successfully");
	}}


