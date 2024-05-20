package productpricingjdpc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import com.chainsys.encapsulation.User;
//import com.chainsys.util.DataChecking;

public class ProductFunction {
	public static void user() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Check check = new Check();
		ArrayList<ProductPricing> customerlist = new ArrayList<ProductPricing>();
		ProductFunction pf = new ProductFunction();
		User1 u = new User1();
		ProductSpecs ps = new ProductSpecs();
		ProductPricing gps = new ProductPricing("gps", 60000, 10, 4, 4);
		ProductPricing gaming = new ProductPricing("Gaming", 70000, 10, 4, 4);
		ProductPricing theater = new ProductPricing("Theater", 50000, 10, 4, 4);
		ProductValidation pv = new ProductValidation();
		DataChecking dc = new DataChecking();
	
		int total = 0;
		System.out.println("Do you have a account (y/n):");
		String acc = sc.next();

		while (true) {
			if (acc.equals("y") || acc.equals("Y")) {
				System.out.println("Great! you have a account");
				System.out.println("-------LOGIN PAGE--------");
				String username = ProductValidation.name();
				u.setUsername(username);
				String pwd = ProductValidation.pwd();
				u.setPassword(pwd);
				check.login(u);
				System.out.println("ID are: "+u.id);
			}

			while (true) {
				if (acc.equals("n") || acc.equals("N")) {
					System.out.println("SIGNUP PAGE");

					String firstname = ProductValidation.name();
					u.setUsername(firstname);

					System.out.println("Last Name:");
					String lastname = sc.next();

					String pwd = ProductValidation.pwd();
					u.setPassword(pwd);

					String phonenumber = ProductValidation.phone();
					u.setPhonenumber(phonenumber);

					u.getFirstname();
					check.Register(u);
					System.out.println("phone number:" + u.getPhonenumber());
				}
			
				
				
				System.out.println("Our Products Are");
				
				read();	
				while(true) {
					ProductPricing obj1=new ProductPricing();
					System.out.println("Do you Want to buy Y or N");
					String ans=sc.next();
				 if(ans.equals("Y") || ans.equals("y")) {
					 
					System.out.println("Enter The Id:");
					int value=sc.nextInt();
					int totalprice=check.productselect(value);
					customerlist.add(check.productDetails(value));
					System.out.println("The purchase Price:"+totalprice);
					 total+=totalprice;
				}
				  if(ans.equals("N") || ans.equals("n")){
					System.out.println("Thanks For Visitng My Products");
				
					for(ProductPricing p:customerlist) {
						System.out.println("------------Bill----------------");
						System.out.println("Name of Product:"+p.getNameofproduct());
						System.out.println("Cost of Product:"+p.getCostofproduct());
						System.out.println("Total Stocks:"+p.getNoofusers());
						System.out.println("Total Warranty:"+p.getNoofwarranty());
						System.out.println("Product Rating:"+p.getProductrating());
						System.out.println("---------------------------------");
						System.out.println("Total Purchase amount is"+total);
					}
					
					break;
				
				}
				
			
					
				}
			}

		}
	}
	
	
	public static void admin() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Check check = new Check();
		ProductFunction pf = new ProductFunction();
		System.out.println("ADMIN USER LOGIN:");
		LinkedList liuser = new LinkedList();
		LinkedList lipwd = new LinkedList();
		liuser.add("Rajaguru");
		lipwd.add("Raja#321");
		liuser.add("vasa");
		lipwd.add("Vasa!123");
	String admin = sc.next();
		System.out.println("Password");
		String pwd = sc.next();
		while (true) {
			if (liuser.contains(admin) && lipwd.contains(pwd)) {
				ProductPricing gps1 = new ProductPricing("gps", 60000, 10, 4, 4);
				ProductPricing gaming1 = new ProductPricing("Gaming", 70000, 10, 4, 4);
				ProductPricing theater1 = new ProductPricing("Theater", 50000, 10, 4, 4);
				Connection con = DataChecking.getConnection();
				String query = "Select *from Product_pricing_info";
				Statement sc1 = con.createStatement();
				ResultSet rs = sc1.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnNumber = rsmd.getColumnCount();
				while (rs.next()) {
					for (int i = 1; i <= columnNumber; i++) {
						String columnValue = rs.getString(i);
						System.out.println(rsmd.getColumnName(i) + " : " + columnValue + " ");
					}
					System.out.println("");

				}
				break;
			}
			
		   else {
				System.out.println("Enter the correct username");
				admin = sc.next();
				System.out.println("Enter the correct password");
				pwd = sc.next();

			}
			
			}

			System.out.println("1)Add Product 2)Delete Product 3)update product 4)Exit");
			int cred = sc.nextInt();
		switch (cred) {
			case 1:
				System.out.println("Product Name");
				String productname = sc.next();
				System.out.println("Product Cost");
				int productcost = sc.nextInt();
				System.out.println("Product User");
				int productuser = sc.nextInt();
				System.out.println("Product warranty");
				int productwarranty = sc.nextInt();
			System.out.println("Product Rating");
			double productrating = sc.nextDouble();

				ProductPricing pp = new ProductPricing(productname, productcost, productuser, productwarranty,
						productrating);

				check.add(pp);
				break;
			case 2:
				System.out.println("Enter The ID");
				int delete = sc.nextInt();
				check.delete(delete);
				break;
			case 3:
				System.out.println("Enter The ID");
				System.out.println("Product Name");
				String name = sc.next();
				System.out.println("Product Cost");
				int cost = sc.nextInt();
				System.out.println("Product warranty");
				int warranty = sc.nextInt();
				System.out.println("Product Rating");
				int id = sc.nextInt();
				check.update(name, cost, warranty,id);
				break;
			case 4:
				System.exit(0);
			    break;
			

			}
		

		}
	public static void read() throws ClassNotFoundException, SQLException
	{
		Connection con = DataChecking.getConnection();
		String query = "Select *from Product_pricing_info";
		Statement sc1 = con.createStatement();
		ResultSet rs = sc1.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnNumber = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnNumber; i++) {
				String columnValue = rs.getString(i);
				System.out.println(rsmd.getColumnName(i) + " : " + columnValue + " ");
			}
			System.out.println("");

		}
	}
	
		}
		


