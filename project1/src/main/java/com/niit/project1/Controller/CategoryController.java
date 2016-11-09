package com.niit.project1.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.project2.DAO.CategoryDAO;
import com.niit.project2.Model.Category;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@SuppressWarnings("unused")
	@Autowired
	private Category category;
	
	@Autowired
	Model mv;
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String listCategories(Model model){
		model.addAttribute("category", "category");
		model.addAttribute("categoryList",this.categoryDAO.list());
		return "category";
		
	}
	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category){
		String newID =(category.getCategoryid());
		category.setCategoryid(newID);
		if(categoryDAO.save(category)==true)
		{
			mv.addAttribute("msg", "Successfully created the category");
			
		}
		else
		{
			mv.addAttribute("msg", "not able to create the category");
		}
		return "category";
	}
	
	@RequestMapping("categoryremove/{id}")
	public ModelAndView deleteCategory(@PathVariable("id") String id) throws Exception{
		
		boolean flag = categoryDAO.delete(id);
		ModelAndView mv = new ModelAndView("category");
		String msg = "Successfully done the operation";
		if(flag!=true)
		{
			msg = "the operation could not success";
			
		}
		mv.addObject("msg",msg);
		
		return mv;
	 	
	}
	@RequestMapping("category/edit/{id}")
	public String editCategory(@ModelAttribute("category")Category category){
		
		if(categoryDAO.update(category) == true)
		{
		   mv.addAttribute("msg", "Successfully updated the category");
		}
		else
		{
			mv.addAttribute("msg", "unable to delete the category");
	}
		return "category";
	
		
	}
	}
	 
	
	



