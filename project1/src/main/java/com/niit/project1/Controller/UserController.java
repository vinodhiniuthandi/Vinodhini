package com.niit.project1.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.project2.DAO.CategoryDAO;
import com.niit.project2.DAO.ProductDAO;
import com.niit.project2.DAO.SupplierDAO;
import com.niit.project2.DAO.UserDAO;
import com.niit.project2.Model.Category;
import com.niit.project2.Model.Product;
import com.niit.project2.Model.Supplier;
import com.niit.project2.Model.User;

@Controller
public class UserController 
{
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Category category;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private Product product;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private User user;
	
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value="name")String userid,
			@RequestParam(value="password")String password)
	{
		user = userDAO.isValidUser(userid, password);
		ModelAndView mv = null;
		if( user == null){
			mv = new ModelAndView("home");
			mv.addObject("error message","invalid credentials");
		}else{
			if (user.getRole().equals("ROLE_ADMIN")){
				mv = new ModelAndView("admin");
				session.setAttribute("categoryList", categoryDAO.list());
				session.setAttribute("supplierList", supplierDAO.list());
				session.setAttribute("productList", productDAO.list());
				
				session.setAttribute("category", category);
				session.setAttribute("product", product);
				session.setAttribute("supplier", supplier);
			}else if (user.getRole().equals("ROLE_USER")){
				mv = new ModelAndView("home");
				
				session.setAttribute("userName",user.getName());
				session.setAttribute("userid", user.getUserid());
			}
		}
		return mv;
	
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("/home");
		session.invalidate();
		session = request.getSession(true);
		session.setAttribute("category",category);
		session.setAttribute("categoryList",categoryDAO.list());
		
		mv.addObject("logoutmessage", "you successfully logged out");
		mv.addObject("loggedout","true");
		
		return mv;
	}
		
	
}
