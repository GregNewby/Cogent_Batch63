/**
 * 
 */
package com.cogent.Mini_Project_Implementation.Service;

import java.util.List;

import com.cogent.Mini_Project_Implementation.Bean.Product01;

/**
 * @author Greg N.
 * @date :
 * 
 */
public interface NewmartService {
	public boolean addProduct(int prodid, String prodname, int prodcat, String manufacture_date, double price,
			String expiration);
	public boolean deleteProductbyID(int prodid);
	public boolean deleteProductCat(int cat);
	public Product01 findCheapestProductInCat(int cat);
	public List<Product01> findProductsInCat(int cat);
	public Product01 findproductByID(int prodid);
	public boolean updateProductName(int prodid, String newProdname);
	public List<Product01> findExpiredProducts(String staleDate);

}
