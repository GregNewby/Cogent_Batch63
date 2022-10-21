/**
 * 
 */
package com.cogent.Mini_Project_Implementation.Service;

import java.time.LocalDate;
import java.util.List;

import com.cogent.Mini_Project_Implementation.Bean.Product01;

/**
 * @author Greg N.
 * @date : 10-14-22
 * 
 */

public interface NewmartService {
	public boolean addProduct(Product01 prod1);
	public boolean deleteProductbyID(int prodid);
	public boolean deleteProductCat(int cat);
	public Product01 findCheapestProductInCat(int cat);
	public List<Product01> findProductsInCat(int cat);
	public Product01 findproductByID(int prodid);
	public boolean updateProductName(int prodid, String newProdname);
	public List<Product01> findExpiredProducts(LocalDate staleDate);
	public void disconnect();

}
