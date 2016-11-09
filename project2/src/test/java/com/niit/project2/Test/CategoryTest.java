package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.CategoryDAO;
import com.niit.project2.Model.Category;


public class CategoryTest {
	 public static void main( String[] args )
	 {
	 	@SuppressWarnings("resource")
	 	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	 	context.scan("com.niit.project2");
	 	context.refresh();
	 	CategoryDAO categoryDAO= (CategoryDAO) context.getBean("categoryDAOImpl");
	 	Category category = (Category) context.getBean("category");	
	 	category.setCategoryid("CT001");
	 	category.setName("Lap");
	 	category.setDescription("This is Laptop");
	 	categoryDAO.save(category);
	 	 System.out.println( "objects are created successfully");
	 }}


