package com.rameshsoft.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private String filePath;
	private FileInputStream fip;
	private Workbook workbook;
	
	public ExcelUtility(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException{
		this.filePath = filePath;
		fip = new FileInputStream(filePath);
		workbook = WorkbookFactory.create(fip);
	}
	public String getCellData(String sheetName,int rowNum,int cellNum){
		String cellData = "";
		Optional<Workbook> optional = Optional.ofNullable(workbook);
		if (optional.isPresent()) {
			Cell cell = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
			if (cell.getCellType() == CellType.STRING) {
				cellData = cell.getStringCellValue();
			}
			else if (cell.getCellType() == CellType.NUMERIC) {
				cellData = cell.getNumericCellValue()+"";
			}
			else if (cell.getCellType() == CellType.BOOLEAN) {
				cellData = cell.getBooleanCellValue()+"";
			}
		}
		return cellData;
	}
	
	
	public void writeDataToExcel(String sheetName,int rowNum,int cellNum,String cellData) throws FileNotFoundException, IOException {
		workbook.getSheet(sheetName).createRow(rowNum).createCell(cellNum).setCellValue(cellData);
		workbook.write(new FileOutputStream(filePath));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
