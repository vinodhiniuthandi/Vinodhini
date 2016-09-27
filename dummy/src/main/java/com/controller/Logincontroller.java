package com.controller;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Logincontroller
{
	@RequestMapping(value="/")
	public String showHome()
	{
		return "Home";
		
	}
	
	@RequestMapping("/Login")
	public String showLogin()
	{
		return "Login";
	}
	@RequestMapping("/SignUp")
	public String showSignUp()
	{
		return "SignUp";
	}
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		return "AboutUs";
	} 
	@RequestMapping("/ContactUs")
	public String showContactUs(){
		return "ContactUs";
}
     
}
                              