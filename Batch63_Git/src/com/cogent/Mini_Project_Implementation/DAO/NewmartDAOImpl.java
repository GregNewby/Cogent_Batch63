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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cogent.Mini_Project_Implementation.Bean.Product01;

/**
 * @author Greg N.
 * @date : 10-14-22
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
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.conn;
	}
	
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addProduct(Product01 prod1) {
		if(this.conn==null) {
			connect();
		}
		
		try(PreparedStatement ps=conn.prepareStatement("insert into products (prodname,prodcat,manufacture_date,price,expiration) values (?,?,?,?,?);");){
			
			ps.setString(1, prod1.getProdname());
			ps.setInt(2, prod1.getProdcat());
			ps.setDate(3, java.sql.Date.valueOf(prod1.getManufacture_date()));// change from local date to SQL date
			ps.setDouble(4, prod1.getPrice());
			ps.setDate(5, java.sql.Date.valueOf(prod1.getExpiration()));
			int worked= ps.executeUpdate();
			
	
			
			if(worked>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteProductbyID(int prodid) {
		if(this.conn==null) {
			connect();
		}
		
		try(PreparedStatement ps=conn.prepareStatement("delete from products where prodid=?;");){
			
			ps.setInt(1, prodid);

			int worked= ps.executeUpdate();
			
			
			if(worked>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteProductCat(int cat) {
		if(this.conn==null) {
			connect();
		}
		
		try(PreparedStatement ps=conn.prepareStatement("delete from products where prodcat=?;");){
			
			ps.setInt(1, cat);

			int worked= ps.executeUpdate();
			
	
			
			if(worked>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Product01 findCheapestProductInCat(int cat) {
		if(this.conn==null) {
			connect();
		}
		
		try(PreparedStatement ps=conn.prepareStatement("select * from products where price=(select min(price) from products where prodcat=?);");){
			
			ps.setInt(1, cat);

			ResultSet result= ps.executeQuery();
			
			
			
			while(result.next()){
				this.prod= new Product01(result.getInt("prodid"), result.getString("prodname"), result.getInt("prodcat"),
						result.getDate("manufacture_date").toLocalDate(), result.getDouble("price"), result.getDate("expiration").toLocalDate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.prod;
	}

	@Override
	public List<Product01> findProductsInCat(int cat) {
		if(this.conn==null) {
			connect();
		}
		this.prodList.clear();
		try(PreparedStatement ps=conn.prepareStatement("select * from products where prodcat=?;");){
			
			ps.setInt(1, cat);

			ResultSet result= ps.executeQuery();
			
			
			while(result.next()){
				this.prod= new Product01(result.getInt("prodid"), result.getString("prodname"), result.getInt("prodcat"),
						result.getDate("manufacture_date").toLocalDate(), result.getDouble("price"), result.getDate("expiration").toLocalDate());
				this.prodList.add(this.prod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.prodList;
	}

	@Override
	public Product01 findproductByID(int prodid) {
		if(this.conn==null) {
			connect();
		}
		
		try(PreparedStatement ps=conn.prepareStatement("select * from products where prodid=?;");){
			
			ps.setInt(1, prodid);

			ResultSet result= ps.executeQuery();
			
			
			while(result.next()){
				this.prod= new Product01(result.getInt("prodid"), result.getString("prodname"), result.getInt("prodcat"),
						result.getDate("manufacture_date").toLocalDate(), result.getDouble("price"), result.getDate("expiration").toLocalDate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		disconnect();
		return this.prod;
	}

	@Override
	public boolean updateProductName(int prodid, String newProdname) {
		if(this.conn==null) {
			connect();
		}
		
		try(PreparedStatement ps=conn.prepareStatement("update products set prodname=? where prodid=?;");){////////////////////////////////////////////
			
			ps.setString(1, newProdname);
			ps.setInt(1, prodid);
			
			int worked= ps.executeUpdate();
			
			
			if(worked>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product01> findExpiredProducts(LocalDate staleDate) {
		if(this.conn==null) {
			connect();
		}
		this.prodList.clear();
		try(PreparedStatement ps=conn.prepareStatement("select * from products where expiration<?;");){
			
			ps.setDate(1, java.sql.Date.valueOf(staleDate));

			ResultSet result= ps.executeQuery();
			
			
			while(result.next()){
				this.prod= new Product01(result.getInt("prodid"), result.getString("prodname"), result.getInt("prodcat"),
						result.getDate("manufacture_date").toLocalDate(), result.getDouble("price"), result.getDate("expiration").toLocalDate());
				this.prodList.add(this.prod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.prodList;
	}

}
