package com.mongoose.dao;

import java.util.ArrayList;

import com.mongoose.model.Reimbursments;

public interface iEmployee 
{

	ArrayList<Reimbursments> viewMyTickets(int user_id);//by passing in these users we will recieve an array of there 
															 //current Reimbursments
	// Takes in a new reimbursement object and creates in the reimbursement table
	boolean createARequest(Reimbursments newRemb);
	
	
}
