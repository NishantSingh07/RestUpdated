package TestScripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.qa.util.XlReader;

import junit.framework.Assert;



public class TestXlReader {
	
		
 @Test
  public TestXlReader() throws Exception
 {
	XlReader read = new XlReader();
read.xlReader();
	 
	 }
 }

