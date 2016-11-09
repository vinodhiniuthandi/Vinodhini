package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.BillingAddressDAO;
import com.niit.project2.Model.BillingAddress;
public class BillingAddressTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		BillingAddressDAO billingAddressDAO= (BillingAddressDAO) context.getBean("billingAddressDAOImpl");
		BillingAddress billingAddress = (BillingAddress) context.getBean("billingAddress");
      billingAddress.setCustomerid("CS001");
      billingAddress.setBillingAddressid("BA002");
      billingAddress.setLine1("chidambaram");
      billingAddress.setLine2("cdm");
      billingAddress.setCity("chennai");
      billingAddress.setState("tamilnadu");
      billingAddress.setZipcode("608401");
      billingAddress.setCountry("India");
      billingAddressDAO.saveOrUpdate(billingAddress);
    
        
		 System.out.println( "Details are created successfully");
	}
}
