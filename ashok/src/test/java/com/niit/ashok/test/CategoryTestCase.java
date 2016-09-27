package com.niit.ashok.test;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ashok.DAO.CategoryDAO;
import com.niit.ashok.DAO.CategoryDAOImpl;
import com.niit.ashok.model.Category;

public class CategoryTestCase {

	@Autowired
	AnnotationConfigApplicationContext context;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ashok");
		context.refresh();
		category =(Category) context.getBean("category");
		categoryDAO =(CategoryDAO) context.getBean("categoryDAO");
		
	}
	@Test
	public void createCategoryTestCase()
	{
		category.setId("Lap01");
		category.setName("Dell");
		category.setDesc("This is a Laptop.");
		
		Assert.assertEquals("Create Category",true, categoryDAO.save(category));
	}
	@Test
	public void updateCategoryTestCase()
	{
		category.setId("Lap01");
		category.setName("HP");
		category.setDesc("HP Laptop");
		
		Assert.assertEquals(true, categoryDAO.update(category));
	}
	@Test
	public void deleteCategoryTestCase()
	{
	Assert.assertEquals(true, categoryDAO.delete("Laptop"));	
	}
    @Test
	public void getCategotyTestCase()
	{
		Assert.assertEquals(true, categoryDAO.get("Lap01"));
		
	}
    @Test
    public void listCategoryTestCase()
    {
    	Assert.assertEquals("List Category", 5, categoryDAO.list().size());
    	
    }
}
