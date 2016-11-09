package com.niit.project2.Model;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity
@Table(name="customer")
@Component
public class Customer{
	@Id
private String customerid;
	@Pattern(regexp="(^$|[0-9]{10})",message="Enter a 10 digit valid phone no")
	
	private String mobile;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@NotBlank(message="Password should be filled")
	@Length(min=8,message="Password should have minimum 8 characters")
		
	private String password;
	
	@NotBlank(message="Gender should be selected")
	private String gender;
	
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}	
}

