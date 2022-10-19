/**
 * 
 */
package com.cogent.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.spring.bean.Product02;
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
	public void addProduct(Product02 prod) {
		
	}

	@Override
	public void deleteProduct(int prodid) {
		
	}

	@Override
	public Product02 displayByID(int prodid) {
		return null;
	}

	@Override
	public List<Product02> displayAll() {
		return null;
	}

	@Override
	public void updateByID(int prodid, Product02 prod) {

	}

}
