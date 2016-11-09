package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
	@Entity
	@Table(name="user")
	@Component
	public class User {
	@Id
		private String userid ;
	private String name;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		private String password ;
		private String mobile ;
		private String role ;
		private String Address;
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
	}
