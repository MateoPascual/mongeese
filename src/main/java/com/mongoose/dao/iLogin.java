package com.mongoose.dao;

import com.mongoose.model.Employees;
import com.mongoose.model.User_Roles;

public interface iLogin 
{

	Employees createEmployee (Employees newEmployee);//PREPARED
	Employees login (String login, String pass);//use a stored procedure to get the user type,
												//this will dictate the front end view and ability
												//sending the user to employee or managerPREPARED
	String getUserType(int ers_user_role_id);//retrieve the user type store locally  use a stored proc

}
