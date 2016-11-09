package com.niit.project2.Model;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table(name="CATEGORY")/*in h2 category table=name*/
@Component
public class Category{
@Id
	private String categoryid;
	public String getCategoryid() {
	return categoryid;
}
public void setCategoryid(String categoryid) {
	this.categoryid = categoryid;
}
	private String name;
	private String description;
	
	/*mapping new name in description(instead of description some thing like "desc" )column in database @column(name="description")*/
	@Transient
	private Set<Product> products;
	@OneToMany(mappedBy ="category",fetch=FetchType.EAGER)
	
		public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
	