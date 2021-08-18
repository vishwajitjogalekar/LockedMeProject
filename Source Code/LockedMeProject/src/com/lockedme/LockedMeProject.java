package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProject {

	static final String folderpath="E:\\Simplilearn Docs\\Phase1Project\\Locker Project File";
	public static void main(String[] args) {
		
		// Variable Declaration
		Scanner sc=new Scanner(System.in);
		
		int choice;
		int proceed=1;
		
		System.out.println("*********************************************************");
		System.out.println("\t Company Lockers Pvt. Ltd.");
		System.out.println("\t Project- Locker Project");
		System.out.println("\t Developed by- Vishwajit Jogalekar");
		System.out.println("*********************************************************");
		
		do {	
		//Menu
		System.out.println("*********************************************************");
		System.out.println("1. Display all Files in the folder");
		System.out.println("2. Add new File to folder");
		System.out.println("3. Delete file from folder");
		System.out.println("4. Search file");
		System.out.println("5. Exit");
		System.out.println("*********************************************************");
		System.out.println("Enter Your Choice");
		choice=Integer.parseInt(sc.nextLine());
		System.out.println();
		
		switch(choice)
		{
			case 1:
				FileDetails.getAllFiles(folderpath);
				break;
			case 2:
				addNewFile(sc);
				break;
			case 3:
				deleteFile(sc);
				break;
			case 4:
				searchFile(sc);
				break;
			case 5: 
				System.out.println("*********************************************************");
				
				System.out.println("Thank You!! Application is closed");
				proceed=0;
				break;
			default:
				System.out.println("Invalid Option is selected");
				break;
		}
		}while(proceed>0);
		
		// Close scanner object
//		sc.close();
	}

	public static void searchFile(Scanner sc) {
		String fileName;
		System.out.println("Enter file Name");
		fileName=sc.nextLine();
		FileDetails.searchFile(folderpath, fileName);
	}

	public static void deleteFile(Scanner sc) {
		String fileName;
		System.out.println("Enter file Name");
		fileName=sc.nextLine();
		FileDetails.deleteFile(folderpath, fileName);
	}
	
	public static void addNewFile(Scanner sc) {
		String fileName;
		int linesCount;
		List<String> fileContent= new ArrayList<String>();
		
		System.out.println("Enter file Name");
		fileName=sc.nextLine();

		// Read number of lines from the user
		System.out.println("Enter lines in the file");
		linesCount=Integer.parseInt(sc.nextLine());
		
		// Read lines from user
		for(int i=0;i<linesCount;i++)
		{
			System.out.println("Enter line"+i+":");
			fileContent.add(sc.nextLine());
		}
		FileDetails.createFile(folderpath, fileName, fileContent);
	}

}
	