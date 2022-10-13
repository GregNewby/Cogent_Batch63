/**
 * 
 */
package com.cogent.app01.repo02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cogent.app01.bean.EmployeeBean;

/**
 * @author Greg N.
 * @date :
 * 
 */
public interface DAO {
//	public static final String pass = "Legend";
//	public static final String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
	public void closeConnection();
	public boolean insertEmployee(int employeenumber,String firstname, String lastname, String email, String extention,int reportsTo, String officeCode, String jobTitle);
	public boolean updateEmployeeName(int id, String name);
	public boolean deleteEmployee(int id);
	public EmployeeBean findEmployeeByID(int id);
	public List<EmployeeBean> findEmployeeByName(String name);
	public EmployeeBean findEmployeeByEmail(String email);
	public List<EmployeeBean> first5Records();

}
