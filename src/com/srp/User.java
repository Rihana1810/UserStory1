package com.srp;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author SRihana
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int choice;
		String s = "";
		Database db = new Database();
		Person cu = new Person();
		Complaint co = new Complaint();
		
		do {
			System.out.println("Kindly !!!! Enter your choice of option you want to Perform : ");
			System.out.println("1. To View all the Availbale  customers by respective name and keyid");
			System.out.println("2. To View Complaints raised by Particular Customer using ID ");
			System.out.println("3. Select a complaint to view its status");
			System.out.println("4. To Launch a new complaint");
			
			choice = sc.nextInt();
			
			if (choice < 0 || choice > 5) {
				System.out.println("Error....Invalid choice......Please Enter a valid number\n");
			}
			
			else {
				switch(choice) {
				case 1 : db.displayCustomers();
						 s = sc.nextLine();
						 break;
				case 2 : System.out.println("Enter Customer ID");
					     int i = sc.nextInt();
						 db.displayComplaints(i);
						 s = sc.nextLine();
						 break;
				case 3 : System.out.println("Enter the complaint ID");
					     int id = sc.nextInt();
						 db.displayStatus(id);
						 s = sc.nextLine();
						break;
				case 4 : cu.launchComplaint();
						 s = sc.nextLine();
						 break;
				case 5 : System.out.println("End of Menu\n");
				         return;
				default : break;
				}
			}
			
		}while(choice > 0 || choice < 5);
		
	}

}