package testPack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LockersCo {
	 
	// Main directory 
	static final String Directory = "/home/raghunandanj007/eclipse-workspace/Test/src/testPack/";

	public static void Menu() {
		// Main Menu
		System.out.println("\nPlease choose one of the options below:- ");
		System.out.println("\nOption 1: Show files in the current directory");
		System.out.println("\nOption 2: Interface options");
		System.out.println("\nOption 3: Close the application");
	}
		// File handling menu
	public static void InterfaceMenu() {
		System.out.println("\nOption 1: Add a file to the existing list");
		System.out.println("\nOption 2: Delete a chosen file from the directory");
		System.out.println("\nOption 3: Search a specified file in the directory");
		System.out.println("\nOption 4: Return to the main menu"); 
		System.out.println("\nChoose one of the above options");
	}

	// code for displaying all files in the current directory
	public static void CurrentFiles() {
		File directoryPath = new File("/home/raghunandanj007/eclipse-workspace/Test/src/testPack");
		ArrayList<String> dp = new ArrayList<String>(Arrays.asList(directoryPath.list()));
		Collections.sort(dp);
		System.out.println("\nList of files in ascending order is: \n" + dp);
	}
	
	//method to add a new file to the directory
	public static void addFile(Scanner sc) {
		System.out.println("Please type the file name\n");
		String fileNameInput = sc.next();
		fileNameInput = new String(fileNameInput.concat(".txt"));
		File file = new File(Directory + fileNameInput);
		try {
			file.createNewFile();
			System.out.println("File Name:  " + file.getName() + " has been created successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// method to delete a file
	public static void deleteFile(Scanner sc) {
		System.out.println("\nEnter name of the file to be deleted");
		String input = sc.next();
		File file = new File(Directory + input);
		try {
			if (file.delete()) {
				System.out.println(file.getName() + " has been deleted successfully");
			} else {
				System.out.println("File not found in the directory");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//search for a specific file
	public static void fileSearch(Scanner sc) {
		System.out.println("\nEnter name of the file to search");
		String input = sc.next();
		File file = new File(Directory + input);
		input = new String(input);
		if (file.exists()) {
			System.out.println("\n The File " + file.getName() + " has been found");
		} else {
			System.out.println("\nThe File " + file.getName() + " does not seem to exist");
		}
	}


	public static void main(String[] args) {

		// Welcome Screen and Developer Details
		System.out.println("Welcome to LockedMe.com");
		System.out.println("\nDeveloper Details: ");
		System.out.println("\nName: Raghunandan J");
		System.out.println("\nDesignation: Full Stack Developer");
		System.out.println("\nCompany : Lockers Pvt Ltd");

		// calling first menu
		Menu();
		Scanner MM = new Scanner(System.in);
		int menu = MM.nextInt();
		if (menu == 1) {
			CurrentFiles();
			System.exit(0);
		} else if (menu == 2) {
			InterfaceMenu();
		} else if (menu == 3) {
			System.out.println("Closing application...See you next time");
			System.exit(0);
		}else {
			System.out.println("\nYou have entered an invalid choice");
			Menu();
			MM.close();
		}
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input == 1) {
			addFile(sc);
		} else if (input == 2) {
			deleteFile(sc);
		} else if (input == 3) {
			fileSearch(sc);
		} else if(input ==4)
			System.out.println("\nReturning to main menu");
			Menu();
		} 
			
		
			
		
}

