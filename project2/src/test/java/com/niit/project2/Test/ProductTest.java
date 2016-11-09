package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.ProductDAO;
import com.niit.project2.Model.Product;

public class ProductTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
	    ProductDAO productDAO= (ProductDAO) context.getBean("productDAOImpl");
	    Product product = (Product) context.getBean("product");
	 product.setProductid("PD002");
	 product.setName("Apple");
	 product.setPrice("40000");
	 product.setSupplierid("SP001");
	 product.setCategoryid("CT001");
	 
	productDAO.save(product);

	    
		 System.out.println( "Details are created successfully");
	}

	}



