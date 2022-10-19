/**
 * 
 */
package com.cogent.spring.service;

import java.util.List;

import com.cogent.spring.pojo.Product02;

/**
 * @author Greg N.
 * @date :
 * 
 */
public interface ProdService {
	public void addProduct(Product02 product);
	public void deleteProductByID(int prodid);
	public Product02 getProductByID(int prodid);
	public List<Product02> getAllProducts();
	public void UpdateProductById(int prodid);

}
