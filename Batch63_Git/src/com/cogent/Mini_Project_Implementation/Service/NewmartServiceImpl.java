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
	public boolean addProduct(int prodid, String prodname, int prodcat, String manufacture_date, double price,
			String expiration) {
		
		return false;
	}

	@Override
	public boolean deleteProductbyID(int prodid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductCat(int cat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product01 findCheapestProductInCat(int cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product01> findProductsInCat(int cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product01 findproductByID(int prodid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProductName(int prodid, String newProdname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product01> findExpiredProducts(String staleDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
