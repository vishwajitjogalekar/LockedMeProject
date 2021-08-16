package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileDetails {
	
	
	/**
	 * This method will return the names of all the files in the specified folder
	 * @param folderPath
	 * @return fileNames
	 */
	public static List<String> getAllFiles(String folderPath)
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
	    
	    //return file list
	    return fileNames;
	}
	
	/**
	 * This method will create file into the specified folder.
	 * @param folderpath
	 * @param fileName
	 * @param content
	 * @return boolean
	 */
	public static boolean createFile(String folderpath, String fileName, List<String> content)
	{
		try
		{
			File file =new File(folderpath,fileName);
			FileWriter writer=new FileWriter(file);
			
			for(int i=0;i<content.size();i++)
			{
				
			}
			for(String s:content)
			{
				 writer.write(s+"\n");
			}
			writer.close();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/**
	 * This method will delete the file from folder
	 * @param folderpath
	 * @param fileName
	 * @return boolean
	 */
	public static boolean deleteFile(String folderpath, String fileName)
	{
		File file =new File(folderpath+"\\"+fileName);
		try 
		{
		    if(file.delete())
		    	return true;
			else
				return false;
	
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
