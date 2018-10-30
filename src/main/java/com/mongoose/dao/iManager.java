package com.mongoose.dao;

import java.util.ArrayList;

import com.mongoose.model.Reimbursments;

public interface iManager 
{
	// Returns sorted ArrayList of Reimbursement objects
	ArrayList<Reimbursments> viewAllSorted(); //sort the list and return all STATEMENT
	
	// Takes in a reimbursement id and a string to which the reimbursement status will be updated
	boolean approveOrDeny (int status_id, String update);//patch statement update the current account
	
}
