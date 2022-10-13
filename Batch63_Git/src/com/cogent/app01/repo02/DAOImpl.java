/**
 * 
 */
package com.cogent.app01.repo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cogent.app01.bean.EmployeeBean;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class DAOImpl implements DAO{
	private Connection conn= null;
	EmployeeBean employee= null;
	List<EmployeeBean> list= new ArrayList<>();
	
	private boolean isConnected() {
		if(this.conn != null) {
			return true;
		}
		return false;
	}
	
	private Connection connect() {
		if(this.conn == null) {
			try (FileInputStream fis= new FileInputStream("test.properties");){
				Properties prop= new Properties();
				prop.load(fis);
				
				String driver= prop.getProperty("Driver");
				String url= prop.getProperty("url");
				String uname= prop.getProperty("uname");
				String pass= prop.getProperty("pswd");
				
				Class.forName(driver);
				this.conn = DriverManager.getConnection(url, uname , pass);
	

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
		}
		return this.conn;
	}
	
	public void closeConnection() {
		if(this.conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean insertEmployee(int employeenumber,String firstname, String lastname, String email, String extention,int reportsTo, String officeCode, String jobTitle) {
		if(conn == null) {
			connect();
		}
		
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into employees values(?,?,?,?,?,?,?,?);");
			ps.setInt(1, employeenumber);
			ps.setString(2, lastname);
			ps.setString(3, firstname);
			ps.setString(4, extention);
			ps.setString(5, email);
			ps.setString(6, officeCode);
			ps.setInt(7, reportsTo);
			ps.setString(8, jobTitle);
			
			
			int worked= ps.executeUpdate();
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
	public boolean updateEmployeeName(int id, String name) {
		if(conn == null) {
			connect();
		}
		try {
			
			PreparedStatement ps=conn.prepareStatement("update employees set firstname=? where employeenumber=?;");
			ps.setString(1, name);
			ps.setInt(2, id);
			
			int i=ps.executeUpdate();
		
			if(i>0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		if(conn == null) {
			connect();
		}
		try {
			
			PreparedStatement ps=conn.prepareStatement("delete from employees where employeenumber=?;");
			ps.setInt(1, id);
			
			int i=ps.executeUpdate();
		
			if(i>0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public EmployeeBean findEmployeeByID(int id) {
		if(conn == null) {
			connect();
		}
		
		this.employee= null;
		try {
			
			PreparedStatement ps=conn.prepareStatement("select * from employees where employeenumber=?;");
			ps.setInt(1, id);
			
			//ps.executeQuery();
			ResultSet result = ps.executeQuery();
			
			
			while(result.next()) {
				this.employee= new EmployeeBean(result.getInt("employeenumber"),result.getString("firstname"),result.getString("lastname"),result.getString("email"),result.getString("extension"),result.getInt("reportsTo"),result.getString("officeCode"),result.getString("jobTitle"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.employee;
	
	}

	@Override
	public List<EmployeeBean> findEmployeeByName(String name) {
		if(conn == null) {
			connect();
		}
		this.list.clear();
		try {
			
			PreparedStatement ps=conn.prepareStatement("select * from employees where firstname=?;");
			ps.setString(1, name);
			
			//ps.executeQuery();
			ResultSet result = ps.executeQuery();
			
			
			while(result.next()) {
				EmployeeBean e = new EmployeeBean(result.getInt("employeenumber"),result.getString("firstname"),result.getString("lastname"),result.getString("email"),result.getString("extension"),result.getInt("reportsTo"),result.getString("officeCode"),result.getString("jobTitle"));
				this.list.add(e);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.list;
	}

	@Override
	public EmployeeBean findEmployeeByEmail(String email) {
		if(conn == null) {
			connect();
		}
		
		this.employee= null;
		try {
			
			PreparedStatement ps=conn.prepareStatement("select * from employees where email=?;");
			ps.setString(1, email);
			
			
			ResultSet result = ps.executeQuery();
			
			
			while(result.next()) {
				this.employee= new EmployeeBean(result.getInt("employeenumber"),result.getString("firstname"),result.getString("lastname"),result.getString("email"),result.getString("extension"),result.getInt("reportsTo"),result.getString("officeCode"),result.getString("jobTitle"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.employee;
	}

	@Override
	public List<EmployeeBean> first5Records() {
		if(conn==null) {
			connect();
		}
		
		this.list.clear();
		try (FileOutputStream fos= new FileOutputStream("emp1.dat");ObjectOutputStream oos= new ObjectOutputStream(fos);){
			PreparedStatement ps= conn.prepareStatement("select * from employees order by employeenumber limit 5;");
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				this.list.add(new EmployeeBean(result.getInt("employeenumber"),result.getString("firstname"),result.getString("lastname"),result.getString("email"),result.getString("extension"),result.getInt("reportsTo"),result.getString("officeCode"),result.getString("jobTitle")));
			}
	
			oos.writeObject(this.list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return this.list;
	}


}