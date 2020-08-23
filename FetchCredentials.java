package Simplilearn.com.lockmeapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FetchCredentials {
	
	public void FetchAllCredentials() 
	{
		System.out.println("*======================================*");
		System.out.println("*                                      *");
		System.out.println("*    WELCOME TO DIGITAL LOCKER         *");
		System.out.println("*       YOUR CREDENTALS ARE            *");
		System.out.println("*                                      *");
		System.out.println("*======================================*");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = input.nextLine();
		
		File fileObj = new File("//home//mercyme234yahoo//eclipse-workspace//Phase1//Lockme.txt");
		
		try {
			Scanner scannerReader =new Scanner(fileObj);
			String line =null;
			
		     try {
				Scanner scanner =new Scanner(fileObj);
				while (scanner.hasNextLine()) 
				
				{
					line = scanner.nextLine();
					String[] values = line.split(",");
					
					if (values[0].equals(username) ) {
		
						System.out.println(values[1] + ", " +values[2] +", " + values[3]);				
					
					}
					
					input.close();									
					}
					
		} catch (Exception e) {
			
		}
	} catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	}
		finally {
			
		}
	}
}
