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
		System.out.println("\nOption 1: Show files in the curent directory");
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

	public static void CurrentFiles() {
		// code for displaying all files in the current directory
		// List of all files and directories
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


	public static void main(String[] args) {

		// Welcome Screen and Developer Details
		System.out.println("Welcome to LockedMe.com");
		System.out.println("\nDeveloper Details: ");
		System.out.println("\nName: Raghunandan J");
		System.out.println("\nDesignation: Full Stack Developer");
		System.out.println("\nCompany : Lockers Pvt Ltd");

		File file = new File(Directory);
		String[] fileNames = file.list();

		// calling first menu
		Menu();
		Scanner MM = new Scanner(System.in);
		int menu = MM.nextInt();
		if (menu == 1) {
			CurrentFiles();
		} else if (menu == 2) {
			InterfaceMenu();
		} else if (menu == 3) {
			System.out.println("Closing application...See you next time");
			System.exit(0);
	}
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input == 1) {
			addFile(sc);
		}
}
}
