package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.CustomerDAO;
import com.niit.project2.Model.Customer;

public class CustomerTest {
@SuppressWarnings("resource")
public static void main( String[] args )
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.project2");
	context.refresh();
	CustomerDAO customerDAO= (CustomerDAO) context.getBean("customerDAOImpl");
	Customer customer = (Customer) context.getBean("customer");
 customer.setCustomerid("CS001");
 customer.setGender("male");
 customer.setMobile("1234567890");
 customer.setPassword("12345678");
 customerDAO.save(customer);
	 System.out.println( "Details are created successfully");
}}

