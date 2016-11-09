package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
	@Entity
	@Table(name="billingAddress")
	@Component
	public class BillingAddress{
		@Id
		private String BillingAddressid;
		private String customerid;
		public String getCustomerid() {
			return customerid;
		}
		public void setCustomerid(String customerid) {
			this.customerid = customerid;
		}
		@NotBlank(message="specify main address ")
		private String line1;
		private String line2;
		public String getLine2() {
			return line2;
		}
		public void setLine2(String line2) {
			this.line2 = line2;
		}
		@NotBlank(message="specify city")
		private String city;
		@NotBlank(message="specify country")
		private String country;
		@NotBlank(message="specify state")
		private String state;
		@NotBlank(message="specify zipcode")
		private String zipcode;
		public String getBillingAddressid() {
			return BillingAddressid;
		}
		public void setBillingAddressid(String billingAddressid) {
			BillingAddressid = billingAddressid;
		}
		public String getLine1() {
			return line1;
		}
		public void setLine1(String line1) {
			this.line1 = line1;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		
		}

