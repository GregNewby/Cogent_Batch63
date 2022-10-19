/**
 * 
 */
package com.cogent.spring.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.spring.bean.Product02;
import com.cogent.spring.service.ProdService;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Controller
public class ProdController {
	@Autowired
	ProdService prodservice;
	
	public void run() {
		Product02 prod= new Product02("Fruit bowl", 100, LocalDate.parse("2022-10-23"), .80, LocalDate.parse("2022-10-27"));
		prodservice.addProduct(prod);
	}
	
	public void addProduct(Product02 prod) {
		prodservice.addProduct(prod);
	}

	
	public void deleteProduct(int prodid) {
		prodservice.deleteProduct(prodid);
	}

	
	public Product02 displayByID(int prodid) {
		return prodservice.displayByID(prodid);
	}

	
	public List<Product02> displayAll() {
		return prodservice.displayAll();
	}

	
	public void updateByID(int prodid, Product02 prod) {
		prodservice.updateByID(prodid, prod);
	}
}
