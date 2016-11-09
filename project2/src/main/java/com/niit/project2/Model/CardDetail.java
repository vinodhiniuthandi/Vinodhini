package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
@Entity
@Component
public class CardDetail {
	@Id
	
	private String cardDetailId;

		private String customerid;
		
	public String getCustomerid() {
			return customerid;
		}

		public void setCustomerid(String customerid) {
			this.customerid = customerid;
		}

	@NotBlank(message="Card number must be entered")
		
	private String cardNumber;
		
	@NotBlank(message="Expiry month must be selected")
		
	private String expiryMonth;
		
	@NotBlank(message="Expiry year must be selected")
		
	private String expiryYear;

	@NotBlank(message="CV number must be entered")
		
	private String cvNumber;
		
	@NotBlank(message="Name must be entered")
		
	private String nameOnCard;

	public String getCardDetailId() {
		return cardDetailId;
	}

	public void setCardDetailId(String cardDetailId) {
		this.cardDetailId = cardDetailId;
	}
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getCvNumber() {
		return cvNumber;
	}

	public void setCvNumber(String cvNumber) {
		this.cvNumber = cvNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}}

