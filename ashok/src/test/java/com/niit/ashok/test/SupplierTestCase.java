package com.niit.ashok.test;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ashok.DAO.SupplierDAO;
import com.niit.ashok.DAO.SupplierDAOImpl;
import com.niit.ashok.model.Supplier;



public class SupplierTestCase {
@Autowired
AnnotationConfigApplicationContext context;
@Autowired
SupplierDAO supplierDAO;
@Autowired
Supplier supplier;
@Before
public void init(){
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.ashok");
	context.refresh();
	supplier =(Supplier) context.getBean("supplier");
	supplierDAO =(SupplierDAO) context.getBean("supplierDAO");
}@Test
public void createCategoryTestCase()
{
	supplier.setId("SP01");
	supplier.setName("Samsung");
	supplier.setAddress("Hyderabad.");
	
	Assert.assertEquals("Create Supplier",true, supplierDAO.save(supplier));
}
@Test
public void updateSupplierTestCase()
{
	supplier.setId("SP01");
	supplier.setName("Samsung");
	supplier.setAddress("Mysore.");
	
	Assert.assertEquals(true,supplierDAO.update(supplier) );
}
@Test
public void deleteSupplierTestCase()
{
Assert.assertEquals(true, supplierDAO.delete("Laptop"));	
}
@Test
public void getSupplierTestCase()
{
	Assert.assertEquals(true, supplierDAO.get("Lap01"));
	
}
@Test
public void listSupplierTestCase()
{
	Assert.assertEquals("List supplier", 5, supplierDAO.list().size());
	
}
}
