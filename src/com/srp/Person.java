package com.srp;

import java.util.Arrays;
import java.util.Scanner;

/**************
 * @author SRihana
 *
 **************/
public class Person implements Customer {

	int id;
	String name;
	Complaint [] c_list;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, Complaint[] c_list) {
		super();
		this.id = id;
		this.name = name;
		this.c_list = c_list;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", c_list=" + Arrays.toString(c_list) + "]";
	}

	public void displayCustomers() {
		System.out.println("Name : " + name + ", ID : " + id);
	}

	@Override
	public void launchComplaint() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the complaint title : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the complaint description : ");
		String s2 = sc.nextLine();
		System.out.println("Complaint Succesfully Launched");
	}
}