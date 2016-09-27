package com.niit.ashok.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.ashok.model.Category;



@Repository
public interface CategoryDAO {
public boolean save(Category category);
public boolean update(Category category);
public boolean delete(String id);
public Category get(String id);
public List<Category> list();

}