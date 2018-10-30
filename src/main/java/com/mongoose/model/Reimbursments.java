package com.mongoose.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Reimbursments implements Serializable
{

	private static final long serialVersionUID = 1L;

	private int reimb_id;
	private int reimb_amount;
	private Date reimb_submitted;
	private Date reimb_resolved;
	private String reimb_discription;
	private byte[] reimb_receipt;
	private int reimb_author;
	private int reimb_resolver;
	private int reimb_status_id;
	private int reimb_type_id;
	
	public Reimbursments() {}
	
	public int getReimb_id() {
		return reimb_id;
	}
	public void setReimb_id(int reimb_id) {
		this.reimb_id = reimb_id;
	}
	public int getReimb_amount() {
		return reimb_amount;
	}
	public void setReimb_amount(int reimb_amount) {
		this.reimb_amount = reimb_amount;
	}
	public Date getReimb_submitted() {
		return reimb_submitted;
	}
	public void setReimb_submitted(Date reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}
	public Date getReimb_resolved() {
		return reimb_resolved;
	}
	public void setReimb_resolved(Date reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}
	public String getReimb_discription() {
		return reimb_discription;
	}
	public void setReimb_discription(String reimb_discription) {
		this.reimb_discription = reimb_discription;
	}
	public byte[] getReimb_receipt() {
		return reimb_receipt;
	}
	public void setReimb_receipt(byte[] reimb_receipt) {
		this.reimb_receipt = reimb_receipt;
	}
	public int getReimb_author() {
		return reimb_author;
	}
	public void setReimb_author(int reimb_author) {
		this.reimb_author = reimb_author;
	}
	public int getReimb_resolver() {
		return reimb_resolver;
	}
	public void setReimb_resolver(int reimb_resolver) {
		this.reimb_resolver = reimb_resolver;
	}
	public int getReimb_status_id() {
		return reimb_status_id;
	}
	public void setReimb_status_id(int reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}
	public int getReimb_type_id() {
		return reimb_type_id;
	}
	public void setReimb_type_id(int reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}
	
	@Override
	public String toString() {
		return "Reimbursment [reimb_id=" + reimb_id + ", reimb_amount=" + reimb_amount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_discription=" + reimb_discription
				+ ", reimb_receipt=" + Arrays.toString(reimb_receipt) + ", reimb_author=" + reimb_author
				+ ", reimb_resolver=" + reimb_resolver + ", reimb_status_id=" + reimb_status_id + ", reimb_type_id="
				+ reimb_type_id + "]";
	}
	
	public Reimbursments(int reimb_id, int reimb_amount, Date reimb_submitted, Date reimb_resolved,
			String reimb_discription, byte[] reimb_receipt, int reimb_author, int reimb_resolver, int reimb_status_id,
			int reimb_type_id) {
		super();
		this.reimb_id = reimb_id;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_discription = reimb_discription;
		this.reimb_receipt = reimb_receipt;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}
	
	


}
