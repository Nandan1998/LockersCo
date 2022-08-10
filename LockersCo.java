package testPack;

import java.io.File;
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

	public static void CurrentFiles() {
		// code for displaying all files in the current directory
		// List of all files and directories
		File directoryPath = new File("/home/raghunandanj007/eclipse-workspace/Test/src/testPack");
		ArrayList<String> dp = new ArrayList<String>(Arrays.asList(directoryPath.list()));
		Collections.sort(dp);
		System.out.println("\nList of files in ascending order is: \n" + dp);
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
		}

	}

}
