package com.niit.project2.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.project2.DAO.CardDetailDAO;
import com.niit.project2.Model.CardDetail;
public class CardDetailTest {

	@SuppressWarnings("resource")
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.project2");
		context.refresh();
		CardDetailDAO cardDetailDAO= (CardDetailDAO) context.getBean("cardDetailDAOImpl");
		CardDetail cardDetail = (CardDetail) context.getBean("cardDetail");
		cardDetail.setCardDetailId("CD001");
	      cardDetail.setCardNumber("0123456789");
	      cardDetail.setCustomerid("CS001");
	      cardDetail.setCvNumber("1234567890");
	      cardDetail.setExpiryMonth("may");
	      cardDetail.setExpiryYear("2030");
	      cardDetail.setNameOnCard("vinodh");
      cardDetailDAO.save(cardDetail);
    
        
		 System.out.println( "Details are created successfully");
	}

}
