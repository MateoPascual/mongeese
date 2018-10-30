package com.mongoose.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mongoose.model.Reimbursments;
import com.mongoose.util.ConnectionFactory;

public class loginMan implements iManager {
	
	public ArrayList<Reimbursments> viewAllSorted(){
		
		ArrayList<Reimbursments> myList = new ArrayList<>();
		
		try (Connection conn = ConnectionFactory.getInstance().getConnection();){
			
			String sql = "SELECT * FROM ERS_REIMBURSEMENT";
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				Reimbursments r = new Reimbursments();
				
				r.setReimb_id(rs.getInt(1));
				r.setReimb_amount(rs.getInt("REIMB_AMOUNT"));
				r.setReimb_submitted(rs.getDate("REIMB_SUBMITTED"));
				r.setReimb_resolved(rs.getDate("REIMB_RESOLVED"));
				r.setReimb_discription(rs.getString("REIMB_RESOLVED"));
				r.setReimb_receipt(rs.getBytes("REIMB_RECEIPT"));
				r.setReimb_author(rs.getInt("REIMB_AUTHOR"));
				r.setReimb_resolver(rs.getInt("REIMB_RESOLVER"));
				r.setReimb_status_id(rs.getInt("REIMB_STATUS_ID"));
				r.setReimb_type_id(rs.getInt("REIMB_TYPE_ID"));
				
				myList.add(r);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myList;
	}
	
	


	@Override
	public boolean approveOrDeny(int status_id, String update) {
		// TODO Auto-generated method stub
		return false;
	}

}
