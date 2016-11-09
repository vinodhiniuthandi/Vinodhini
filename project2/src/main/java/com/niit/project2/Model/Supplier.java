package com.niit.project2.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="supplier")
@Component
public class Supplier{
private static final String Image = null;
@Id
private String supplierid;
public String getSupplierid() {
	return supplierid;
}
public void setSupplierid(String supplierid) {
	this.supplierid = supplierid;
}
public static String getImage() {
	return Image;
}
@NotBlank(message="Please give a supplier name")
private String name;

@NotBlank(message="Give supplier a address")
private String address;
@Transient
private MultipartFile supplierImage;
@Transient
private Set<Product> products;
@OneToMany(mappedBy="supplier",fetch=FetchType.EAGER)


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


public MultipartFile getSupplierImage() {
	return supplierImage;
}
public void setSupplierImage(MultipartFile supplierImage) {
	this.supplierImage = supplierImage;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String toString() {
	
return "Supplier [supplierId=" + supplierid + ", Name=" + name +  ", Address=" + address
		
		+ ", image=" + Image + "]";
}}

