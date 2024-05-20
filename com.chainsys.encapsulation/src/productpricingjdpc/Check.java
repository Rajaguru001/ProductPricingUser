package productpricingjdpc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Check implements UserDAO {
	DataChecking dc = new DataChecking();

	public void Register(User1 u) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String checking = "select name From jdpc where name= ?";// raja
		PreparedStatement prestm = connection.prepareStatement(checking);
		prestm.setString(1, u.getUsername());
		ResultSet result = prestm.executeQuery();
		if (!result.next()) {
			String query = "insert into jdpc(name,password,phonenumber) values(?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getPhonenumber());
			ps.executeUpdate();

		} else {
			System.out.println("You have Already Account:");

		}

	}

	public User1 login(User1 u) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String checking = "select * from jdpc where name=? and password=?";
		PreparedStatement prestm = connection.prepareStatement(checking);
		prestm.setString(1, u.getUsername());
		prestm.setString(2, u.getPassword());
		ResultSet result = prestm.executeQuery();
		if (!result.next()) {
			System.out.println("you dont have account");
			return null;
		} else {
			System.out.println("login  successfully");
			User1 user1 = new User1();
			user1.setId(result.getInt("id"));
			user1.setFirstname(result.getString("name"));
			return user1;
		}

	}

	public void add(ProductPricing p) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String update = "INSERT INTO Product_pricing_info (name, price, users,warranty,productrating)\r\n"
				+ "VALUES (?,?,?,?,?);";
		PreparedStatement stm = connection.prepareStatement(update);
		stm.setString(1, p.getNameofproduct());
		stm.setInt(2, p.getCostofproduct());
		stm.setInt(3, p.getNoofusers());
		stm.setInt(4, p.getNoofwarranty());
		stm.setDouble(5, p.getProductrating());
		int rows = stm.executeUpdate();
		System.out.println("Updated product :" + rows);

	}

	public void delete(int id) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String delete = "delete from Product_pricing_info where ID=?";
		PreparedStatement stm = connection.prepareStatement(delete);
		stm.setInt(1, id);
		int row = stm.executeUpdate();
		System.out.println("Deleted product :" + row);

	}

	public void update(String name, int price, int warranty, int id) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String update = "update from Product_pricing_info(name,price,warranty)+value(?,?,?) where ID=?";
		PreparedStatement stm = connection.prepareStatement(update);
		stm.setString(1, name);
		stm.setInt(2, price);
		stm.setInt(3, warranty);
		stm.setInt(4, id);

		int row = stm.executeUpdate();
		System.out.println("Updated product :" + row);

	}

	public static int productselect(int id) throws ClassNotFoundException, SQLException {
		Connection con = DataChecking.getConnection();
		String query = "Select price from  Product_pricing_info where id=?";
		PreparedStatement prestm = con.prepareStatement(query);
		prestm.setInt(1, id);
		ResultSet result = prestm.executeQuery();
	//	Scanner scn = new Scanner(System.in);
		if (result.next()) {
			int price = result.getInt("price");
			return price;
		} else {
			return 0;
		}
	

	}

	public static ProductPricing productDetails(int id) throws ClassNotFoundException, SQLException {
		Connection con = DataChecking.getConnection();
//		ArrayList<ProductPricing> customerlist = new ArrayList<ProductPricing>();
		String query = "Select * from  Product_pricing_info where id=?";
		PreparedStatement prestm = con.prepareStatement(query);
		prestm.setInt(1, id);
		ResultSet result = prestm.executeQuery();
		ResultSetMetaData rsmd = result.getMetaData();
		int columnNumber = rsmd.getColumnCount();
		ProductPricing product = new ProductPricing();
		while (result.next()) {
			  
              product.setId(result.getInt("id"));
              product.setNameofproduct(result.getString("name"));
              product.setCostofproduct(result.getInt("price"));
              product.setNoofusers(result.getInt("users"));
              product.setNoofwarranty(result.getInt("warranty"));
              product.setProductrating(result.getDouble("productrating"));
//              customerlist.add(product);
			}
		
			return product;

		}
//	public static int totalwarranty(ProductPricing obj1) throws ClassNotFoundException, SQLException {
//
//		Scanner sc=new Scanner(System.in);
//		Connection con = DataChecking.getConnection();
//		String query = "Select warranty from Product_pricing_info where id=?";
//		PreparedStatement prestm = con.prepareStatement(query);
//		prestm.setInt(1,obj1.getId());
//		System.out.println("gfgsgsysus");
//		ResultSet result = prestm.executeQuery();
//		String ans=sc.next();
//		int warranty=obj1.g;
//		
//			warranty += 1;
//		return warranty;
//		
//	}

}
