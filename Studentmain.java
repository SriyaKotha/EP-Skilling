package com.klu.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;

public class Studentmain {
	
	private static Scanner sc;
	 
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		StudentBean sb = new StudentBean();
		StudentInsertion si = new StudentInsertion();
		sc = new Scanner(System.in);
		int i,in_ch;
		while(true) {
			System.out.println("Select an Operation");
			System.out.println("1.Insertion");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Enter your choice : ");
			int ch =sc.nextInt();
			switch(ch) {
				case 1 : System.out.println("Insertion");
						System.out.println("Enter Registration Number: ");
						int id = sc.nextInt();
						sb.setReg_no(id);
						System.out.println("Enter Name: ");
						String name = sc.next();
						sb.setName(name);
						System.out.println("Enter Email-Id: ");
						String email = sc.next();
						sb.setEmail(email);
						i = si.StudentInsert(sb);
						if(i>0)
						{
							System.out.println("Insertion is successfull");
						}
						else
						{
							System.out.println("Insertion is failed");
						}
						break;
		
				case 2 : System.out.println("Updation");
						System.out.println("Select the Element to update");
						System.out.println("1.Name");
						System.out.println("2.Email");
						in_ch = sc.nextInt();
						switch(in_ch)
						{
			 			 	case 1 : System.out.println("Update Name : ");
			 			 			System.out.println("Enter Regno : ");
			 			 			int n_1 = sc.nextInt();
			 			 			System.out.println("Enter Name : ");
			 			 			String em_1 = sc.next();
			 			 			i = si.StudentUpdate_name(n_1,em_1);
			 			 			if(i>0)
									{
										System.out.println("Updation is successfull");
									}
									else
									{
										System.out.println("Updation is failed");
									}
			 			 			break;
			 			 
			 			 	case 2 : System.out.println("Update Email : ");
			 			 			System.out.println("Enter Regno : ");
			 			 			int n_2 = sc.nextInt();
			 			 			System.out.println("Enter Email-id : ");
			 			 			String em_2 = sc.next();
			 			 			i = si.StudentUpdate_email(n_2,em_2);
			 			 			if(i>0)
									{
										System.out.println("Updation is successfull");
									}
									else
									{
										System.out.println("Updation is failed");
									}
			 			 			break;
			 			 
			 			 	default : System.exit(0);
						}
						break;
			 
				case 3 : System.out.println("Deletion");
						System.out.println("Select the Element You want to delete with:");
						System.out.println("1.Registration no.");
						System.out.println("2.Name");
						System.out.println("3.Email");
						in_ch = sc.nextInt();
						switch(in_ch)
						{
							case 1 : System.out.println("Delete using Reg no");
									System.out.println("Enter Reg No : ");
									int num = sc.nextInt();
									i = si.StudentDelete_regno(num);
									if(i>0)
									{
										System.out.println("Deletion is successfull");
									}
									else
									{
										System.out.println("Deletion is failed");
									}
									break;
			 			 
							case 2 : System.out.println("Delete using Name");
									System.out.println("Enter Name : ");
									String na= sc.next();
									i = si.StudentDelete_name(na);
									if(i>0)
									{
										System.out.println("Deletion is successfull");
									}
									else
									{
										System.out.println("Deletion is failed");
									}
									break;
	 			 		 
							case 3 : System.out.println("Delete using Email");
									System.out.println("Enter Email : ");
									String na_1 = sc.next();
									i = si.StudentDelete_email(na_1);
									if(i>0)
									{
										System.out.println("Deletion is successfull");
									}
									else
									{
										System.out.println("Deletion is failed");
									}
									break;
		 		 		 
							default : System.exit(0);	     
						}
						break;
			 
				case 4 : System.out.println("Display Data \n");
						si.Student_Display();
						break;
			 		 
				case 5 : System.exit(0);
				
				default: System.out.println("Invalid Choice \n");
			}
		}		
	}
}
