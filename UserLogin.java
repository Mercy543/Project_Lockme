package Simplilearn.com.lockmeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {
	
	private static FetchCredentials cred = new FetchCredentials();
		private static AddCredentials ad = new AddCredentials();
	
	public static void Login()
	{
		
		String line=null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = input.nextLine();
		
		 System.out.println("Enter password   ");
		 String password = input.nextLine();
	    
		
	     File fileObj = new File("//home//mercyme234yahoo//eclipse-workspace//Phase1//Database.txt");
	    boolean isfound =false;
	     try {
			Scanner scanner =new Scanner(fileObj);
			while (scanner.hasNextLine()) 
			
			{
				line = scanner.nextLine();
				String[] values = line.split(",");
				
				if (values[0].equals(username) && values[1].equals(password)) {
	
					isfound=true;
					break;
					
				}
				
				}//end while
				
			if(!isfound) 
			{
				
				 System.out.println("Incorrect username or password");
				
			} else if(isfound)
			 
			{
				 System.out.println("*====================================*");
				 System.out.println("* 1.    Fetch all credentials         *");
				 System.out.println("* 2.    Add new Credential            *");
				 System.out.println("*=====================================*");
				 
				 Scanner action1 = new Scanner(System.in);
					int act = action1.nextInt();
					if(act==1) 
					{
						
						cred.FetchAllCredentials();
					}
					else if(act==2) 
					{
						ad.AddNewCredential();
					}
					else {System.out.println("Invalid action");
					}action1.close();
			 }
			 else {System.out.println("invalid");
			 }
			
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    input.close();
	    
		
	}

}
