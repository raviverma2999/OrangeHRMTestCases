package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityTestDataFile {
	
	public static String getTestData (int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
		
		File file=new File("C:\\Users\\admin\\Desktop\\Testdata.xlsx");
		
		XSSFWorkbook book= new XSSFWorkbook(file);
		
		
	Sheet sheet	=(Sheet) book.getSheetAt(0);
		
		
		return ((XSSFSheet) sheet).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		
	}
	
	
	// now whenever you required to pass the test data you need to call the method by its class name 
	
	// like; loginPage.loginToApplication(ExcelUtilityTestDataFile.getTestData(1,0),ExcelUtilityTestDataFile.getTestData(1,1));

}
