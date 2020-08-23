package Simplilearn.com.lockmeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegisterUser {
	
	public void Register() 
	{
		System.out.println("*=======================================*");
		System.out.println("*                                       *");
		System.out.println("*     Welcome to Register Page          *");
		System.out.println("*                                       *");
		System.out.println("*=======================================*");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = input.nextLine();
		
		 System.out.println("Enter password   ");
	     String password = input.nextLine();
	    		
	     
			try {
	    		File fileObj = new File("//home//mercyme234yahoo//eclipse-workspace//Phase1//Database.txt");
	    		
	    	    
	    		try {
	    			fileObj.createNewFile();
	    			if(fileObj.exists()) {
	    			Scanner scanner =new Scanner(fileObj);
	    			String line ="";
	    			boolean isfound=false;
	    			
	    				while (scanner.hasNextLine()) 
	    				{
	    					line = scanner.nextLine();
	    					String[] values = line.split(",");
	    					
	    					if (values[0].equals(username)) 
	    					{
	    		
	    						isfound=true;
	    						break;
	    					
	    					}   
	    				}	
	    				if (isfound) 
	    				{
	    					System.out.println("The username belongs to a registered user");
	    					
	    				}
	    				
	    				else if (!isfound) 
	    				{
	    					
	    			FileWriter fileWriter = new FileWriter(fileObj,true);	    			
	    			fileWriter.append(username + "," + password + "\n" );
	    			fileWriter.close();
	    			System.out.println("you have  Successfully Registered");
	    			
	    			
	    				}
	    			else 
	    			{
	    				throw new FileNotFoundException("File is not found with name "  + fileObj.getName());
	    			
	    			}
	    		
	    			} 
	    	}
	    			catch (IOException e)
	    		{
	    			System.out.println("An error Occured");
	    			e.printStackTrace();
	    		}
	    		
				 
	    		}
			finally {
				
			}
			   		    
		     input.close();
	       
		}
}
