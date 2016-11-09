package com.niit.project1.Controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class HomeController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@SuppressWarnings("unused")
	@Autowired
	private SupplierDAO supplierDAO;
	
	@SuppressWarnings("unused")
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Category category;
	
	@SuppressWarnings("unused")
	@Autowired
	private Supplier supplier;
	
	@SuppressWarnings("unused")
	@Autowired
	private Product product;
	
	@SuppressWarnings("unused")
	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("/")
	public ModelAndView onLoad(HttpSession session){
		ModelAndView mv = new ModelAndView("/Home");
		//session.setAttribute("category", category);
		//session.setAttribute("categoryList", categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value = "user/signup", method = RequestMethod.POST)
	public ModelAndView registeruser(@ModelAttribute User user){
		ModelAndView mv = new ModelAndView("/Home");
		if (userDAO.get(user.getUserid())== null){
			userDAO.saveOrUpdate(user);
			}else{
				mv.addObject("msg", "user exist with this id");
			}
		return mv;
	}

}

