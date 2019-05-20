package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.data.User;

public class UserDaoImpl implements UserDao {
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }

	
	private static String url = "jdbc:oracle:thin:@abdoudb.ceuuuwinccbt.us-east-1.rds.amazonaws.com:1521:AbdouDB";
	private static String username = "Abdou_Project";
	private static String password = "Thioye123";
	public User selectUserByUsername(String name) {
		User user = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Employee WHERE username =?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user = new User (rs.getString(1),rs.getString(2));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
