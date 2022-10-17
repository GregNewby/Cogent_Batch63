/**
 * 
 */
package com.cogent.Mini_Project_Implementation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cogent.Mini_Project_Implementation.Bean.Product01;
import com.cogent.Mini_Project_Implementation.Service.NewmartService;
import com.cogent.Mini_Project_Implementation.Service.NewmartServiceImpl;
import com.cogent.app01.bean.EmployeeBean;

/**
 * @author Greg N.
 * @date : 10-14-22
 * 
 */
public class NewmartClient {
	public static void main(String[] args) {
		NewmartService srvs= new NewmartServiceImpl();
		Product01 product= null;
		Scanner scanner= new Scanner(System.in);
		boolean cont= true;
		
		while(cont) {
		
			System.out.println("*******************************");
			System.out.println("\tNewmart Database");
			System.out.println("*******************************");
			System.out.println("1. Add Product");
			System.out.println("2. Delete product by ID");
			System.out.println("3. Delete products in catagory");
			System.out.println("4. Find cheapest product in category");
			System.out.println("5. Find products in category");
			System.out.println("6. Find product by ID");
			System.out.println("7. Update product name");
			System.out.println("8. Find expired products");
			System.out.println("9. Exit\n");
		
			String prodname;
			int prodid;
			int prodcat;
			double price;
		
			System.out.println("Enter the number of the option you would like to choose: ");
			int num= scanner.nextInt();
			switch(num) {
			case 1:
				try {
					System.out.println("Enter the new product name");
					scanner.nextLine();
					prodname= scanner.nextLine();
					System.out.println("Enter category code");
					prodcat= scanner.nextInt();
					System.out.println("Enter the manufacture date yyyy-mm-dd");
					String man= scanner.next();
					LocalDate manufacture= LocalDate.parse(man);
					System.out.println("Enter the price of the product");
					price= scanner.nextDouble();
					System.out.println("Enter the expiration date yyyy-mm-dd");
					String exp= scanner.next();
					LocalDate expiration= LocalDate.parse(exp);
					
					if(srvs.addProduct(new Product01(prodname,prodcat,manufacture,price,expiration))) {
						System.out.println("Product added!");
					} else {System.out.println("Product has not been inserted");}
				} catch (DateTimeParseException dtpe) {
					dtpe.printStackTrace();
				} catch (InputMismatchException ime) {
					ime.printStackTrace();
				}
				break;	
			case 2:
				try {
					System.out.println("Enter the product ID you would like to delete");
					prodid=scanner.nextInt();
					if(srvs.deleteProductbyID(prodid)) {
						System.out.println("Product deleted");
					} else {System.out.println("Product has not been deleted");}
				} catch (InputMismatchException ime) {
					ime.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("Enter the catagory code that you would like to delete");
					prodcat=scanner.nextInt();
					if(srvs.deleteProductCat(prodcat)) {
						System.out.println("All product in the category have been deleted");
					} else {System.out.println("Category has not been deleted");}
				} catch (InputMismatchException ime) {
					ime.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println("Enter the category code to find the cheapest item in the category");
					prodcat=scanner.nextInt();
					System.out.println(srvs.findCheapestProductInCat(prodcat));
				} catch (InputMismatchException ime) {
					ime.printStackTrace();
				}
				break;
			case 5:
				try {
					System.out.println("Enter the category code that you would like to explain");
					prodcat=scanner.nextInt();
					for(Product01 p : srvs.findProductsInCat(prodcat)) {
						System.out.println(p);
					}
				} catch (InputMismatchException ime) {
					ime.printStackTrace();
				}
				break;
			case 6:
				try {
					System.out.println("Enter the product ID of the product that you would like to display");
					prodid=scanner.nextInt();
					System.out.println(srvs.findproductByID(prodid));
				} catch (InputMismatchException ime) {
					ime.printStackTrace();
				}
				break;
			case 7:
				try {
					System.out.println("Enter the product ID you would like to update");
					prodid= scanner.nextInt();
					System.out.println("Enter the new name for the product");
					scanner.nextLine();
					prodname= scanner.nextLine();
					srvs.updateProductName(prodid, prodname);
				} catch (InputMismatchException ime) {
					ime.printStackTrace();
				}
				break;
			case 8:
				for(Product01 p : srvs.findExpiredProducts(LocalDate.now())) {
					System.out.println(p);
				}
				System.out.println("---------------------------------------");
				break;
			case 9:
				System.exit(0);
				break;
			default:
			}
			
			System.out.println("Press 1 to quit or any other number to continue");
			if(scanner.nextInt()==1) {
				cont= false;
				srvs.disconnect();
			}
			
		}

	}

}
