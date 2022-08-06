package testPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Lockers {

	public static void main(String[] args) throws IOException{
		
		//Welcome Screen and Developer Details
		System.out.println("Welcome to LockedMe.com");
		System.out.println("\nDeveloper Details: ");
		System.out.println("\nName: Raghunandan J");
		System.out.println("\nDesignation: Full Stack Developer");
		System.out.println("\nCompany : Lockers Pvt Ltd");
		
		//Main Menu
		System.out.println("\nPlease choose one of the options below:- ");
		System.out.println("\nOption 1: Show current files");
		System.out.println("\nOption 2: Interface options");
		System.out.println("\nOption 3: Close the application");
		
		//Sub Menu
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your choice: ");
		int option = sc.nextInt();
		if(option!=1 && option!=2 && option!=3){
			System.out.println("\nYou have entered an invalid choice");
		}
		
		switch(option) {
		case 1:
			
			//code for displaying all files in the current directory
		    //List of all files and directories
			  File directoryPath = new File("/home/raghunandanj007/eclipse-workspace/Test/src/testPack");
		      ArrayList<String> dp = new ArrayList<String>(Arrays.asList(directoryPath.list()));
		      Collections.sort(dp);
		      System.out.println("\nList of files in ascending order is: \n"+dp);
		      break;
			
		case 2:
			System.out.println("\nChoose one of the below options");
			System.out.println("\nOption 1: Add a file to the existing list");
			System.out.println("\nOption 2: Delete a chosen file from the directory");
			System.out.println("\nOption 3: Search a specified file in the directory");
			System.out.println("\nOption 4: Return to the main menu");
			break;
			
		case 3:
			System.exit(0);
			break;
		}
			
	



}
}