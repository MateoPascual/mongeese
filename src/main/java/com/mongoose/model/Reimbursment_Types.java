package com.mongoose.model;

import java.io.Serializable;

public class Reimbursment_Types implements Serializable
{

	private static final long serialVersionUID = 1L;

	private int reimb_type_id;
	private String reimb_type;
	
	Reimbursment_Types(){}

	public int getReimb_type_id() {
		return reimb_type_id;
	}

	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}

	public String getReimb_type() {
		return reimb_type;
	}

	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}

	@Override
	public String toString() {
		return "Reimbursment_Types [reimb_type_id=" + reimb_type_id + ", reimb_type=" + reimb_type + "]";
	}

	public Reimbursment_Types(int reimb_type_id, String reimb_type) {
		super();
		this.reimb_type_id = reimb_type_id;
		this.reimb_type = reimb_type;
	}
	
	
}
