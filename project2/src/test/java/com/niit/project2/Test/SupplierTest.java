package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.SupplierDAO;
import com.niit.project2.Model.Supplier;


public class SupplierTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAOImpl");
		Supplier Supplier = (Supplier) context.getBean("supplier");
		Supplier.setSupplierid("SP001");
	      Supplier.setName("vinodh");
	      Supplier.setAddress("chidambaram");
		supplierDAO.save(Supplier);
    
        
		 System.out.println( "Details are created successfully");
	}

}
