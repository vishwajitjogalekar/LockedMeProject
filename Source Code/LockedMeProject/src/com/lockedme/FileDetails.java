package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDetails {
	
	static boolean flag=false;
	
	/**
	 * This method will return the names of all the files in the specified folder
	 * @param folderPath
	 * @return fileNames
	 */
	public static void getAllFiles(String folderPath)
	{
		// Creating File Object
		File file=new File(folderPath);
		
		// Getting all the files into File Array
		File[] listOfFiles= file.listFiles();
		
		//Declare a list to store file names
		List<String> fileNames=new ArrayList<String>();
		
	    for (File f1 : listOfFiles) {
			fileNames.add(f1.getName());
		}
	    
	    Collections.sort(fileNames, String.CASE_INSENSITIVE_ORDER);
	    
	    for(String s:fileNames)
	    	System.out.println(s);
	}
	
	/**
	 * This method will create file into the specified folder.
	 * @param folderpath
	 * @param fileName
	 * @param content
	 * @return boolean
	 */
	public static void createFile(String folderpath, String fileName, List<String> content)
	{
		try
		{
			File file =new File(folderpath,fileName);
			FileWriter writer=new FileWriter(file);
			

			for(String s:content)
			{
				 writer.write(s+"\n");
			}
			writer.close();
			flag= true;
		}
		catch(Exception e)
		{
			flag= false;
		}
		
		if(flag)
			System.out.println("File created successfully");
		else
			System.out.println("File not created, some error occured");
	}
	
	/**
	 * This method will delete the file from folder
	 * @param folderpath
	 * @param fileName
	 * @return boolean
	 */
	public static void deleteFile(String folderpath, String fileName)
	{
		File file =new File(folderpath+"\\"+fileName);
		try 
		{
		    if(file.delete())
		    	flag= true;
			else
				flag= false;
	
		}
		catch(Exception e)
		{
			flag= false;
		}
		
		if(flag)
			System.out.println("File deleted successfully");
		else
			System.out.println("File not deleted, some error occured");
	
	}
	
	/**
	 * This method is used to search a file if the file exist in directory
	 * @param folderpath
	 * @param fileName
	 * @return boolean
	 */
	public static void searchFile(String folderpath, String fileName)
	{
		File file =new File(folderpath+"\\"+fileName);
		try 
		{
		    if(file.exists())
		    	flag= true;
			else
				flag= false;
	
		}
	
		catch(Exception e)
		{
			flag= false;
		}
		
		if(flag)
			System.out.println("The Searched File "+fileName+" is present");
		else
			System.out.println("File not present, some error occured");
	}

}
