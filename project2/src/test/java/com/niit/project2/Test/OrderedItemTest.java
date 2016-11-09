package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.OrderedItemDAO;
import com.niit.project2.Model.OrderedItem;

public class OrderedItemTest {
	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
	    OrderedItemDAO orderedItemDAO= (OrderedItemDAO) context.getBean("orderedItemDAOImpl");
	    OrderedItem orderedItem = (OrderedItem) context.getBean("orderedItem");
	 orderedItem.setOrderedItemid("OI001");
	 orderedItem.setCustomerid("CS001");
	 orderedItem.setProductid("PD001");
	 orderedItem.setProductName("Apple");
	 orderedItem.setQuantity("4");
	 orderedItem.setTotalPrice("160000");
	  orderedItemDAO.save(orderedItem);
		 System.out.println( "Details are created successfully");
	}

	}