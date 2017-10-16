package org.jdbc.crud.staticcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String dbURL="jdbc:mysql://localhost:3306/becm13?user=root&password=root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded..");
			con=DriverManager.getConnection(dbURL);
			System.out.println("connection established..");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select *from student_info");
			System.out.println("query executed..");
			while(rs.next())
			{
				int id=rs.getInt("regno");
				String fnm=rs.getString("firstname");
				String lnm=rs.getString("lastname");
				String mnm=rs.getString("middlename");
				System.out.format("%s,%s,%s,%s",id,fnm,lnm,mnm);
				System.out.println();
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("got an exception");
			System.err.println(e.getMessage());
			
		}
		
	}

}
