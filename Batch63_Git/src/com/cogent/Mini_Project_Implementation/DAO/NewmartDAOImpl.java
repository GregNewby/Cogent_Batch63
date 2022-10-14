/**
 * 
 */
package com.cogent.Mini_Project_Implementation.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.cogent.Mini_Project_Implementation.Bean.Product01;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class NewmartDAOImpl implements NewmartDAO {
	
	Connection conn= null;
	Product01 prod= null;
	List<Product01> prodList= new ArrayList<>();
	
	private Connection connect() {
		
		return null;
	}
	
	public void disconnect() {
		
	}

	@Override
	public boolean addProduct(int prodid, String prodname, int prodcat, String manufacture_date, double price,
			String expiration) {
		// TODO Auto-generated method stub
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
