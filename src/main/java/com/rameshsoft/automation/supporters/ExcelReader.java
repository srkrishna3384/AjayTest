package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	FileInputStream fip = new FileInputStream("D:\\6AM-ONLINE\\secondapp\\src\\com\\rameshsoft\\automation\\gmil\\testdata\\GmailTestData.xls");
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet1 = workbook.getSheet("Sheet1");
	//Sheet sheet1 = workbook.getSheetAt(0);
	System.out.println("Last row num: " +sheet1.getLastRowNum());
	System.out.println("Sheet name: " +sheet1.getSheetName());
	System.out.println("First row num: " +sheet1.getFirstRowNum());
	System.out.println("Footer: " +sheet1.getFooter());
	
	Row row0 = sheet1.getRow(0);
	System.out.println("0th Row last cell: " +row0.getLastCellNum());
	
	Cell cell00 = row0.getCell(0);
	System.out.println("0 ROW 0 CELL: " +cell00.getStringCellValue());//0 row 0 cell data
	Cell cell01 = row0.getCell(1);
	System.out.println("0 ROW 1 CELL: " +cell01.getStringCellValue());
	
	Row row1 = sheet1.getRow(1);
	Cell cell10 = row1.getCell(0);
	System.out.println("1 ROW 0 CELL: " +cell10.getStringCellValue());
	Cell cell11 = row1.getCell(1);
	System.out.println("1 ROW 1 CELL: " +cell11.getStringCellValue());
	
	Row row2 = sheet1.getRow(2);
	Cell cell20 = row2.getCell(0);
	System.out.println("2 ROW 0 CELL: " +cell20.getStringCellValue());
	
	Cell cell21 = row2.getCell(1);
	if (cell21.getCellType() == CellType.STRING) {
		System.out.println("2 ROW 1 CELL: " +cell21.getStringCellValue());
	}
	else if (cell21.getCellType() == CellType.NUMERIC) {
		System.out.println("2 ROW 1 CELL: " +cell21.getNumericCellValue());
	}
	/* write data to excel file */
	Row row3 = sheet1.createRow(3);
	Cell cell30 = row3.createCell(0);
	cell30.setCellValue("RAMESHSOFT");
	
	Cell cell31 = row3.createCell(1);
	cell31.setCellValue("9177791456");
	
	FileOutputStream fop = new FileOutputStream("D:\\6AM-ONLINE\\secondapp\\src\\com\\rameshsoft\\automation\\gmil\\testdata\\GmailTestData.xls");
	workbook.write(fop);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
