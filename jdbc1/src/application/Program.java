package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		list();
		//create();
		//update();
		//delete();
	}
	
	public static void list() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {			
			conn = DB.getConnection();
			
			st = conn.createStatement();
			rs = st.executeQuery("select * from department");
			
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + " - Nome: " + rs.getString("name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	
	public static void create() {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
				"INSERT INTO seller (name, email, birth_date, base_salary, department_id) VALUES(?, ?, ?, ?, ?)",
				Statement.RETURN_GENERATED_KEYS
			);
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@email.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3500.0);
			st.setInt(5, 2);
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Insert successfully, ID: " + id);
				}
			}
			else {
				System.out.println("No rows affected");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	
	public static void update() {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("UPDATE seller SET base_salary = ? WHERE department_id = ?");
			st.setDouble(1, 4000.0);
			st.setInt(2, 1);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Update successfully! Rows affected: " + rowsAffected);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
	
	public static void delete() {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("DELETE FROM department WHERE id = ?");
			st.setInt(1, 1);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Deleted successfully! Rows affected: " + rowsAffected);
		}
		catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}






