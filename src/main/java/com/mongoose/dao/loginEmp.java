package com.mongoose.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mongoose.model.Employees;
import com.mongoose.model.User_Roles;
import com.mongoose.util.ConnectionFactory;

public class loginEmp implements iLogin {
	
	public Employees createEmployee(Employees newEmployee) 
	{
		Employees e = new Employees();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			
			conn.setAutoCommit(false);
			
			String sql = "INSERT INTO ers_users (ers_users_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
			String[] values = new String[1];
			values[0] = "ers_users_id";
			
			PreparedStatement pstmt = conn.prepareStatement(sql, values);
			pstmt.setString(1, newEmployee.getErs_username());
			pstmt.setString(1, newEmployee.getErs_password());
			pstmt.setString(2, newEmployee.getUser_first_name());
			pstmt.setString(3, newEmployee.getUser_last_name());
			pstmt.setString(4, newEmployee.getUser_email());
			pstmt.setInt(5, newEmployee.getUser_role_id());
			
			int rowsInserted = pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			
			if (rowsInserted != 0) {
				while(rs.next()) 
				{
					e.setErs_users_id(rs.getInt(1));
					conn.commit();
				}
				
				e.setErs_password(newEmployee.getErs_password());
				e.setErs_username(newEmployee.getErs_username());
				e.setUser_email(newEmployee.getUser_email());
				e.setUser_first_name(newEmployee.getUser_first_name());
				e.setUser_last_name(newEmployee.getUser_last_name());
				e.setUser_role_id(newEmployee.getUser_role_id());
				
			}
			
			//conn.commit();
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return e; // Shouldn't return parameter unchanged.
	}
	
	
	public Employees login(String login, String pass) {
		Employees myEmployee = new Employees(); 
		
		try (Connection conn = ConnectionFactory.getInstance().getConnection();) {
		
			String sql = " SELECT * FROM ers_users WHERE ers_username = ? and ers_password = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, login);
			pstmt.setString(2, pass);
			
			ResultSet rs = pstmt.executeQuery(sql);
			
			while(rs.next())
			{
				myEmployee.setErs_users_id(rs.getInt("ers_users_id"));
				myEmployee.setErs_username(rs.getString("Ers_username"));
				myEmployee.setErs_password(rs.getString("Ers_password"));
				myEmployee.setUser_email(rs.getString("User_email"));
				myEmployee.setUser_first_name(rs.getString("User_first_name"));
				myEmployee.setUser_last_name(rs.getString("User_last_name"));
				myEmployee.setUser_role_id(rs.getInt("User_role_id"));
			}
			
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
		return myEmployee;
	}
	
	
	@Override
	public String getUserType(int ers_user_role_id) {
		String roles = new String();
		try (Connection conn = ConnectionFactory.getInstance().getConnection();)
		{
			String sql = "SELECT * FROM ers_user_roles WHERE ERS_USER_ROLE_ID = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ers_user_role_id);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				roles = rs.getString("USER_ROLE");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return roles;
	}
	
}
