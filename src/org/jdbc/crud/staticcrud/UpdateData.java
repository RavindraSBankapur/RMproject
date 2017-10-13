package org.jdbc.crud.staticcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		String myDB="com.mysql.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/becm13?user=root&password=root";
		String query="update student_info set middlename='s' ";
		try 
		{
			Class.forName(myDB);
			con=DriverManager.getConnection(dbURL);
			stmt=con.createStatement();
			int i=stmt.executeUpdate(query);
			System.out.println("number of rows affected "+i);
			
		} 	
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
