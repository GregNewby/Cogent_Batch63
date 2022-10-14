/**
 * 
 */
package com.cogent.Mini_Project_Implementation.Service;

import java.util.List;

import com.cogent.Mini_Project_Implementation.Bean.Product01;
import com.cogent.Mini_Project_Implementation.DAO.NewmartDAO;
import com.cogent.Mini_Project_Implementation.DAO.NewmartDAOImpl;

/**
 * @author Greg N.
 * @date : 10-14-22
 * 
 */
public class NewmartServiceImpl implements NewmartService {
	
	NewmartDAO newRepo= new NewmartDAOImpl();

	@Override
	public boolean addProduct(String prodname, int prodcat, String manufacture_date, double price,
			String expiration) {
		
		return newRepo.addProduct(prodname, prodcat, manufacture_date, price, expiration);
	}

	@Override
	public boolean deleteProductbyID(int prodid) {
		
		return newRepo.deleteProductbyID(prodid);
	}

	@Override
	public boolean deleteProductCat(int cat) {
		
		return newRepo.deleteProductCat(cat);
	}

	@Override
	public Product01 findCheapestProductInCat(int cat) {
		
		return newRepo.findCheapestProductInCat(cat);
	}

	@Override
	public List<Product01> findProductsInCat(int cat) {
		
		return newRepo.findProductsInCat(cat);
	}

	@Override
	public Product01 findproductByID(int prodid) {
		
		return newRepo.findproductByID(prodid);
	}

	@Override
	public boolean updateProductName(int prodid, String newProdname) {
		
		return newRepo.updateProductName(prodid, newProdname);
	}

	@Override
	public List<Product01> findExpiredProducts(String staleDate) {
		
		return newRepo.findExpiredProducts(staleDate);
	}

}
