package com.srp;

/*******************
 * @author SRihana
 *
******************* */
public class Database {

	Customer [] customer_list;

	public Database() {
		super();
		// TODO Auto-generated constructor stub
		
		customer_list = new Person[3];
		
		/*
		Complaint [] c1 = new Complaint[3];
		c1[0] = new Complaint(1, "t1", "d1", 0, 1);
		c1[1] = new Complaint(2, "t2", "d2", 0, 1);
		c1[2] = new Complaint(3, "t3", "d3", 0, 1);
		*/
		
		Complaint [] c1 = {new Complaint(1, "t1", "d1", 0, 1), new Complaint(2, "t2", "d2", 0, 1), new Complaint(3, "t3", "d3", 0, 1)};
		Complaint [] c2 = {new Complaint(25, "t25", "d25", 0, 2), new Complaint(35, "t35", "d35", 0, 2)};
		Complaint [] c3 = {new Complaint(10, "t10", "d10", 0, 3)};
		
		customer_list[0] = new Person(1, "CustomerOne", c1);
		customer_list[1] = new Person(2, "CustomerTwo", c2);
		customer_list[2] = new Person(3, "CustomerThree", c3);
		
	}
	
	public void displayCustomers() {
		
		System.out.println("Name : Customer1, ID : 1");
		System.out.println("Name : Customer2, ID : 2");
		System.out.println("Name : Customer3, ID : 3");
		
	}
	
	public void displayComplaints(int id) {

		System.out.println("Customer " + id + " made");
		
		if (id == 1) {
			System.out.println("Complaint 1 as Network Issues");
			System.out.println("Complaint 2 as SystemInconsistency");
			System.out.println("Complaint 3 as NoProperService");
		}
		
		else if (id == 2) {
			System.out.println("Complaint 1 as PerformanceDegrading");
			System.out.println("Complaint 2 as NetworkProblems");
		}
		
		else if (id == 3) {
			System.out.println("Complaint 1 as SlowWorking");
		}
		
	}
	
	public void displayStatus(int id) {
		
		Complaint c = new Complaint();
		int ch = c.status;
		
		if (ch == 0) {
			System.out.println("The Complaint is being Processed");
		}
		
		else if (ch == 1) {
			System.out.println("Completed the Process, Complaint has been Closed");
		}
		
	}
	
}