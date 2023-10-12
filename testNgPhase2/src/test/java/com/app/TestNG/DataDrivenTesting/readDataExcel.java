package com.app.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath="C:\\Users\\bhara\\Desktop\\Training\\Testdata1.xlsx";
		File excelfile =new File(filepath);
		FileInputStream fis = new FileInputStream(excelfile);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows =sheet.getLastRowNum();
		System.out.println("Number of rows:"+rows);
		int col=sheet.getRow(1).getLastCellNum();
		System.out.println("Number of colomns:"+col);
		
		for(int r=0;r<rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<col;c++) {
				XSSFCell cell=row.getCell(c);
				CellType celltype =cell.getCellType();
				switch(celltype) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
				default:
					break;
					
					
				}
				System.out.println(" ");
			
			}
			System.out.println();
			
		}
		workbook.close();
	}

}
