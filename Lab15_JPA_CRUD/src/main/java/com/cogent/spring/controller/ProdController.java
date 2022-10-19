/**
 * 
 */
package com.cogent.spring.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.spring.pojo.Product02;
import com.cogent.spring.service.ProdService;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Controller
public class ProdController {
	@Autowired
	ProdService prodService;
	
	public void Run() {
		Product02 prod= new Product02();
		prod.setProdname("Pear");
		prod.setProdcat(100);
		prod.setManufacture_date(LocalDate.now());
		prod.setPrice(1.80);
		prod.setExpiration(LocalDate.parse("2022-10-27"));
		
		prodService.addProduct(prod);
	}

}
