package com.niit.ashok.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.ashok.DAO.CategoryDAO;
import com.niit.ashok.DAO.SupplierDAO;
import com.niit.ashok.model.Category;
import com.niit.ashok.model.Supplier;

public class CategoryTest {
	
	
	public static void main(String[] args)
	{
		//you have get DAO and domain object instance
		//but without using new operator
		//first you get context
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		//ask the context to get the instances/bean
		//you have to specify in which package the classes are there
		context.scan("com.niit.ashok");
		context.refresh();
		CategoryDAO categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		Category category=(Category) context.getBean("category");
		category.setId("LP01");
		category.setName("Dell");
		category.setDesc("This is a Laptop.");
		categoryDAO.save(category);
		
	SupplierDAO supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier=(Supplier) context.getBean("supplier");
		supplier.setId("SP01");
		supplier.setName("Samsung");
		supplier.setAddress("Hyderabad.");
		supplierDAO.save(supplier);
		
		System.out.println("Datas are stored in database.");
		
		
		
	}
}
