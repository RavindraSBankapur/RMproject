package org.jdbc.crud.staticcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//making chages in code and should be updated in repository
public class DeleteData {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String query="delete from student_info where regno=2";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/becm13?user=root&password=root");
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		if(stmt!=null||con!=null)
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	

}
