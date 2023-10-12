package com.app.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
	public static void main(String[] args)throws IOException {
		XSSFWorkbook workbook =new XSSFWorkbook();
		XSSFSheet Sheetone=workbook.createSheet("mysheet");
		Object[][] data= {{"Name","Location"},
				{"Bharath","HYD"},
				{"Ronin","Steam"},
				{"Jay","Mumbai"}};
		int rows=data.length;
		int col=data[0].length;
		
		for(int r=0;r<rows;r++) {
			XSSFRow row =Sheetone.createRow(r);
			for(int c=0;c<col;c++) {
				XSSFCell cell= row.createCell(c);
				Object cellValue=data[r][c];
				cell.setCellValue((String)cellValue);
			
			}
		}
			String excelpath="C:\\Users\\bhara\\Desktop\\Training\\Employees.xlsx";
			File excelfile=new File(excelpath);
			FileOutputStream fos=new FileOutputStream(excelfile);
			workbook.write(fos);
			workbook.close();
			System.out.println("Task Completed");
		}
	}


