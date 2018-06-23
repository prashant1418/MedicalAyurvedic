package com.medical.controller;

import java.sql.*;

public class JDBCConnect {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "Medical");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from loginbean");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}