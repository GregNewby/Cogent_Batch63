/**
 * 
 */
package com.cogent.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.spring.pojo.Product02;
import com.cogent.spring.repo.ProdRepo;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Service
public class ProdServiceImpl implements ProdService {
	@Autowired
	ProdRepo prodRepo;

	@Override
	public void addProduct(Product02 product) {
		prodRepo.save(product);

	}

	@Override
	public void deleteProductByID(int prodid) {
		prodRepo.deleteById(prodid);
	}

	@Override
	public Product02 getProductByID(int prodid) {
		return prodRepo.getById(prodid);
	}

	@Override
	public List<Product02> getAllProducts() {
		return prodRepo.findAll();
	}

	@Override
	public void UpdateProductById(int prodid) {
		// TODO Auto-generated method stub

	}

}
