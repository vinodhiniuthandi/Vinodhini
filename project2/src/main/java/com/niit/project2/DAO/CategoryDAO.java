package com.niit.project2.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.project2.Model.Category;

@Repository
public interface CategoryDAO {

	public boolean  save(Category category);
	public boolean update(Category category);
	public boolean delete (String categoryid);

	public Category  get(String categoryid);

	public List<Category>list();
}

