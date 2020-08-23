package Simplilearn.com.lockmeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddCredentials {
	
	
	@SuppressWarnings("resource")
	public void AddNewCredential() 
	{
		
		System.out.println("*====================================================*");
		System.out.println("*                                                    *");
		System.out.println("*   WELCOME TO DIGITAL LOCKER STORE YOUR CRED HERE   *");
		System.out.println("*                                                    *");
		System.out.println("*====================================================*");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter User Associated with Account: ");
		String useraccount = input.nextLine();
		
		System.out.println("Enter Sitename: ");
		String sitename = input.nextLine();
		
		System.out.println("Enter username   ");
		String username = input.nextLine();
		
		System.out.println("Enter password   ");
		String password = input.nextLine();
		
		File fileObj = new File("//home//mercyme234yahoo//eclipse-workspace//Phase1//Lockme.txt");
		
		try {
			fileObj.createNewFile();
			if(fileObj.exists()) {
			FileWriter fileWriter = new FileWriter(fileObj,true);

			fileWriter.append(useraccount + "," +sitename + "," + username + "," + password + "\n" );
			fileWriter.close();
			System.out.println("YOUR CREDs ARE STORED AND SECURED!! :" );
			}
			else {
				throw new FileNotFoundException("File is not found with name "  + fileObj.getName());
			}
		} catch (IOException e) {
			System.out.println("An error Occured");
			e.printStackTrace();
			input.close();

	};
	};


}
