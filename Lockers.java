package testPack;

import java.util.Scanner;

public class Lockers {

	public static void main(String[] args) {
		
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
		switch(option) {
		case 1:
			System.out.println("\nDisplaying current files");
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