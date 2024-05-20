package com.chainsys.encapsulation;
import java.sql.*;
import java.util.*;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
	Producttable();

	}
	public static void Producttable() throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/productinfo";
        String userName = "root";
        String passWord = "Guru@7733";
        String query = "select * from  productpricefixing";
        Connection con = DriverManager.getConnection(url,userName,passWord);
        Statement ss = con.createStatement();
        ResultSet ps = ss.executeQuery(query);
        ResultSetMetaData rsmd = ps.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        
        while (ps.next()) {
            for (int i =1; i <= columnsNumber; i++) {
             
                String columnValue = ps.getString(i);
               System.out.println( rsmd.getColumnName(i)+ " : "+columnValue+" " );
            }
            System.out.println("");
           
        }
        
        con.close();  
   

    }
	


   

}


