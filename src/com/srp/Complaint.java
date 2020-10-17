package com.srp;

/***************
 * @author SRihana
 *
 *****************/
public class Complaint {

	int id;
	String title;
	String description;
	int status;
	int customer_id;
	
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Complaint(int id, String title, String description, int status, int customer_id) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.customer_id = customer_id;
	}
	
	@Override
	public String toString() {
		return "Complaint [complaint_id=" + id + ", title=" + title + ", description=" + description
				+ ", status=" + status + ", customer_id=" + customer_id + "]";
	}
	
}