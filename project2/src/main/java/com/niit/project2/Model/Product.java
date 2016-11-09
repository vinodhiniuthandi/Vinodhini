package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table(name="product")
@Component
public class Product{
@Id
private String productid;
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}
private String name;
private String price;
private String categoryid;
private String supplierid;
@Transient
@ManyToOne
@JoinColumn(name="categoryid",updatable=false,insertable=false,nullable=false)
private Category category;
@ManyToOne
@JoinColumn (name="supplierid",nullable=false , updatable=false,insertable=false )
private Supplier supplier;
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getCategoryid() {
	return categoryid;
}
public void setCategoryid(String categoryid) {
	this.categoryid = categoryid;
}
public String getSupplierid() {
	return supplierid;
}
public void setSupplierid(String supplierid) {
	this.supplierid = supplierid;
}


}

