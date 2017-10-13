package org.jdbc.crud.staticcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertData {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry="insert into student_info values(2,'Ravindra','Bankapur','Shanmukhappa')";
		Driver d;
		try {
				d = new Driver();
				DriverManager.registerDriver(d);
				System.out.println("driver loaded");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/becm13?user=root&password=root");
				System.out.println("connection establiched..");
				stmt=con.createStatement();
				System.out.println("statement created..");
				stmt.executeUpdate(qry);
				System.out.println("query executed..");
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null||con!=null)
			{
				try {
					stmt.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

}
