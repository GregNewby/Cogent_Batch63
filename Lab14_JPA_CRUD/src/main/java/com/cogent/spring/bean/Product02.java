/**
 * 
 */
package com.cogent.spring.bean;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Entity
@Table(name= "products")
public class Product02 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int prodid;
	public String prodname;
	public int prodcat;
	public LocalDate manufacture_date;
	public double price;
	public LocalDate expiration;
	
	public Product02(){
		super();
	}

	public Product02(String prodname, int prodcat, LocalDate manufacture_date, double price, LocalDate expiration) {
		super();
		this.prodname = prodname;
		this.prodcat = prodcat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expiration = expiration;
	}

	public Product02(int prodid, String prodname, int prodcat, LocalDate manufacture_date, double price,
			LocalDate expiration) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodcat = prodcat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expiration = expiration;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public int getProdcat() {
		return prodcat;
	}

	public void setProdcat(int prodcat) {
		this.prodcat = prodcat;
	}

	public LocalDate getManufacture_date() {
		return manufacture_date;
	}

	public void setManufacture_date(LocalDate manufacture_date) {
		this.manufacture_date = manufacture_date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getExpiration() {
		return expiration;
	}

	public void setExpiration(LocalDate expiration) {
		this.expiration = expiration;
	}

	@Override
	public String toString() {
		return "Product01 [prodid=" + prodid + ", prodname=" + prodname + ", prodcat=" + prodcat + ", manufacture_date="
				+ manufacture_date + ", price=" + price + ", expiration=" + expiration + "]";
	}
	
	
}
