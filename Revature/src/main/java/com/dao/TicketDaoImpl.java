package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.data.Ticket;

public class TicketDaoImpl implements TicketDao {
	
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

	@Override
	public int insertTicket(Ticket x) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Expanse VALUES(?,?,?)");
			ps.setInt(2, x.getType());
			ps.setDouble(3, (float)x.getAmount());
			ps.setString(1, x.getDescription());
			
			ps.executeUpdate();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Ticket> selectAllTickets() {
		List<Ticket> l = new ArrayList<Ticket>();
		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Expanse");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				l.add(new Ticket(rs.getInt(2), rs.getDouble(3), rs.getString(1)));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return l;
	}

}
