/**
 * 
 */
package com.cogent.Mini_Project_Implementation.Bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class Product01 implements Serializable {
	public int prodid;
	public String prodname;
	public int prodcat;
	public LocalDate manufacture_date;
	public double price;
	public LocalDate expiration;
	
	public Product01(){
		super();
	}

	public Product01(String prodname, int prodcat, LocalDate manufacture_date, double price, LocalDate expiration) {
		super();
		this.prodname = prodname;
		this.prodcat = prodcat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expiration = expiration;
	}

	public Product01(int prodid, String prodname, int prodcat, LocalDate manufacture_date, double price,
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

	@Override
	public int hashCode() {
		return Objects.hash(expiration, manufacture_date, price, prodcat, prodid, prodname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product01 other = (Product01) obj;
		return Objects.equals(expiration, other.expiration) && Objects.equals(manufacture_date, other.manufacture_date)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && prodcat == other.prodcat
				&& prodid == other.prodid && Objects.equals(prodname, other.prodname);
	}
	
	
}
