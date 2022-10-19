/**
 * 
 */
package com.cogent.spring.service;

import java.util.List;

import com.cogent.spring.bean.Product02;

/**
 * @author Greg N.
 * @date :
 * 
 */
public interface ProdService {
	public void addProduct(Product02 prod);
	public void deleteProduct(int prodid);
	public Product02 displayByID(int prodid);
	public List<Product02> displayAll();
	public void updateByID(int prodid, Product02 prod);

}
