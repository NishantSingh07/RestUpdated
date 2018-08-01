package com.qa.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class XlWriter {
	
	
	public static void main(String args []) throws IOException
	{
     //Create New folder
		String loc ="C:\\Users\\ZSINNIS\\Desktop\\New Folder";
	
	    boolean fi = new File (loc).exists();
			{			
	            if (fi== true)
	           {     System.out.println("Folder Already Exists");
	
	                       }
	          else
	          {
		    System.out.println("Folder do not exist");
			File f = new File(loc);
		    f.mkdir();
		    
		    String File ="C:\\Users\\ZSINNIS\\Desktop\\New Folder\\Nishant.xlsx";
		    FileOutputStream fos = new FileOutputStream(File);
	        XSSFWorkbook  workbook = new XSSFWorkbook();            

	        XSSFSheet sheet = workbook.createSheet("Nishant");  
	        
	        for (Row row : sheet)
	        {  for (org.apache.poi.ss.usermodel.Cell cell : row)
	        {
	        }
	        
		
	}
	
	}
	
	}
	

	}}
