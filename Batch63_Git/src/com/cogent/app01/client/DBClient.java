/**
 * 
 */
package com.cogent.app01.client;

import java.util.Scanner;

import com.cogent.app01.bean.EmployeeBean;
import com.cogent.app01.repo02.DAO;
import com.cogent.app01.repo02.DAOImpl;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class DBClient {
	public static void main(String[] args) {
		DAO data = new DAOImpl();
		Scanner scanner= new Scanner(System.in);
		boolean cont= true;
		
		while(cont) {
		
			System.out.println("*******************************");
			System.out.println("\tEmployee Database");
			System.out.println("*******************************");
			System.out.println("1. Insert Employee");
			System.out.println("2. Update Employee Name");
			System.out.println("3. Delete Employee");
			System.out.println("4. Find Employee by Employee Number");
			System.out.println("5. Find Employee by name");
			System.out.println("6. Find Employee by email");
			System.out.println("7. Show first 5 employee records");
			System.out.println("8. Exit\n");
		
		
			System.out.println("Enter the number of the option you would like to choose: ");
			int num= scanner.nextInt();
			switch(num) {
			case 1:
				System.out.println("Enter the new employee's employee number");
				int employeenumber= scanner.nextInt();
				System.out.println("Enter the new employee's first name");
				String firstname= scanner.next();
				System.out.println("Enter the new employee's last name");
				String lastname= scanner.next();
				System.out.println("Enter the new employee's email");
				String email= scanner.next();
				System.out.println("Enter the new employee's extention");
				String extention= scanner.next();
				System.out.println("Enter the employeenumber of who the new employee reports to");
				int reportsTo= scanner.nextInt();
				System.out.println("Enter the new employee's officeCode");
				String officeCode= scanner.next();
				scanner.nextLine();//clears \n character
				System.out.println("Enter the new employee's Job Title");
				String jobTitle= scanner.nextLine();
				
				if(data.insertEmployee(employeenumber,firstname,lastname,email,extention,reportsTo,officeCode,jobTitle)) {
					System.out.println("Employee inserted");
				} else {System.out.println("Employee has not been inserted");}
				
				break;
			case 2:
				System.out.println("Enter the employeenumber that you would like to update");
				int empnum=scanner.nextInt();
				System.out.println("Enter what you would like the first name updated to");
				String empname=scanner.next();
				if(data.updateEmployeeName(empnum,empname)) {
					System.out.println("Employee updated");
				} else {System.out.println("Employee has not been updated");}
				break;
			case 3:
				System.out.println("Enter the employeenumber that you would like to delete");
				empnum=scanner.nextInt();
				if(data.deleteEmployee(empnum)) {
					System.out.println("Employee deleted");
				} else {System.out.println("Employee has not been deleted");}
				break;
			case 4:
				System.out.println("Enter the employeenumber that you would like to find");
				empnum=scanner.nextInt();
				System.out.println(data.findEmployeeByID(empnum));
				break;
			case 5:
				System.out.println("Enter the name of the employee that you would like to find");
				empname=scanner.next();
				for(EmployeeBean e : data.findEmployeeByName(empname)) {
					System.out.println(e);
				}
				break;
			case 6:
				System.out.println("Enter the email of the employee that you would like to find");
				email=scanner.next();
				System.out.println(data.findEmployeeByEmail(email));
				break;
			case 7:
				for(EmployeeBean e : data.first5Records()) {
					System.out.println(e);
				}
				break;
			case 8:
				System.exit(0);
				break;
			default:
			}
			
			System.out.println("Press 1 to quit or any other number to continue");
			if(scanner.nextInt()==1) {
				cont= false;
				data.closeConnection();
			}
			
		}

	}

}