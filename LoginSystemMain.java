package Simplilearn.com.lockmeapp;

import java.util.Scanner;

public class LoginSystemMain {
	
	 

	public static void main(String[] args) {
		
		RegisterUser reg = new RegisterUser();
		
		
		System.out.println("=======================================");
		System.out.println("*                                      *");
		System.out.println("*      Welcome to Lockme.com           *");
		System.out.println("*      Your Personal digital Locker    *");
		System.out.println("*                                      *");
	    System.out.println("=======================================*");
	    System.out.println("1.Registration");
		System.out.println("2.Login");	
		System.out.println("=======================================");
	
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==1) 
		{
		
			reg.Register();
			
		}
	 else if (num==2)
	 {
		
		  UserLogin.Login();
		 
	 }	
			
		input.close();	
	
	 }
	

}
