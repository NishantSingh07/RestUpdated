package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlReader {
	
	String File = "C:\\Users\\ZSINNIS\\Desktop\\Nishant.xlsx";
	@SuppressWarnings("deprecation")
		          
	public void xlReader() throws IOException {
		
	FileInputStream fis = new FileInputStream(File);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowcount =0;
	int cellcounter =0;
	String optFile ="C:\\Users\\ZSINNIS\\Desktop\\New Folder\\output.xlsx";
	XSSFWorkbook  workbook = new XSSFWorkbook(); 
    XSSFSheet sh = workbook.createSheet("Nishant");
    
	
	   //Create New folder
	     String loc ="C:\\Users\\ZSINNIS\\Desktop\\New Folder";
         boolean fi = new File (loc).exists();
		  	            if (fi== true)
               {     System.out.println("Folder Already Exists");

                     }
           else
           {
	                System.out.println("Folder do not exist");
		            File f = new File(loc);
	                f.mkdir();
               }
		  
	       //Reading the contents of excel 
	       
	       for (Row row : sheet) {
		         rowcount = rowcount +1;
		                for (Cell cell :row )
		        	 
		                      {  
		                	       cellcounter =cellcounter +1;
		              	                   
			                      // if ((rowcount>1)&&(rowcount<5))
	                                  // {	        	 
			        	  
			        	                  if ((cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC))
	        	   	        		          System.out.println(cell.getNumericCellValue());
			        	                  
			        	                  else 
	   	    	        	            	   if(cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
		     	        	           	         System.out.println(cell.getStringCellValue());
	   	    	        	            	  
		                      }  	
		                   
	             		  	     	        
	       }                
		
	     int rowCount = sheet.getLastRowNum();
	      System.out.println("No of row:----->"+ rowCount);
	      
	        
	      int colCount= sheet.getRow(1).getLastCellNum();
	      
	     System.out.println("No of Column:----->"+ colCount);
	   
	       
	  for (int i =0 ;i <=rowCount;i++)
	       
	       {         sh.createRow(i);
		  
		              String celltext="";
	                  
	       
	                    for (int j=0 ;j <colCount; j++)
	                  
	                  {  
	                    	sh.getRow(i).createCell(j);	  
	                        XSSFCell cell = sheet.getRow(i).getCell(j);
	                                    
	                     if (cell.getCellType()==Cell.CELL_TYPE_STRING)
	               
	                    { 
	                       celltext =cell.getStringCellValue();
	                       System.out.println(celltext);
	                  
	                    }
	               
	               else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
	               
	               {
	                 
	                 celltext =String.valueOf(cell.getNumericCellValue());
	                 System.out.println(celltext);
	                  
	               
	               }                                
	                                
                      
	    sh.getRow(i).getCell(j).setCellValue(celltext);
	   
	    FileOutputStream fos = new FileOutputStream(optFile);
	   	 workbook.write(fos);
	     fos.flush();
	     fos.close(); 
	     wb.close(); 
	       }  
	     
	}
    
    }
	
}
	

       
	
	       
	       
	                             
	              
	     	                         
	                
	          	    
	       /*  	     Writing to excel
	         	    ===================================================================================================
	     	                         
	            {    for (int cell1 =1 ;cell1<colCount;cell1++)
                    
                {
                      Row ro;
                      Cell cel = ro.createCell(cell1).setCellValue("value");
                     
                      
                         }} }                 
	         	    
	         	    
	         	    
	         	    
	         	    
	         	    
	         	    for (Row row1:sh)
	     	        	
	     	                                  {   row1.createCell(cellcounter);
	     	        	                         cellcounter =cellcounter+1;
	     	        	                            for (Cell cel : row1)
	     	        		   
	     	        	                            {         
	     	        		                         // Writing the content to new file
	     	        	                    	 
		   	    	        	            	       {cel.setCellType( XSSFCell.CELL_TYPE_STRING);
			     	        	                     cel.setCellValue(cell.getStringCellValue()); 
			     	        	           	         }
	     	        		               if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)	     	        			   
	     	        		              {
        	    	        		       cel.setCellType(XSSFCell.CELL_TYPE_NUMERIC);
   	    	        	                   cel.setCellValue(cell.getNumericCellValue());
	     	        		              }
   	    	        	                	     	        		              
   	    	        	           */      
	     	        		                 
	     	        		              
	     	          
	     	        
	         
		     
	     	
	        	 
	        	 
	        	 
	        	 
	        	 
	        	
	        		
	     	      	     	
	     	      	     	
	         
	     	      	     	
	  
	     	      	     	

		     
		

