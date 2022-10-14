/**
 * 
 */
package com.cogent.Mini_Project_Implementation.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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
		try(FileInputStream fis= new FileInputStream("test2.properties");){
			Properties prop= new Properties();
			prop.load(fis);
			
			String driver= prop.getProperty("Driver");
			String url= prop.getProperty("url");
			String uname= prop.getProperty("uname");
			String pass= prop.getProperty("pswd");
			
			Class.forName(driver);
			this.conn= DriverManager.getConnection(url, uname, pass);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.conn;
	}
	
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean addProduct(String prodname, int prodcat, String manufacture_date, double price,
			String expiration) {
		if(this.conn==null) {
			connect();
		}
		
		try(PreparedStatement ps=conn.prepareStatement("insert into products (prodname,prodcat,manufacture_date,price,expiration) values (?,?,?,?,?);");){
			
			ps.setString(1, prodname);
			ps.setInt(2, prodcat);
			ps.setString(3, manufacture_date);
			ps.setDouble(4, price);
			ps.setString(5, expiration);
			int worked= ps.executeUpdate();
			
			disconnect();
			
			if(worked>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
