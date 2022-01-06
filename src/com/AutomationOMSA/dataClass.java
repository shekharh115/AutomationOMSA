package com.AutomationOMSA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataClass {
	public static XSSFWorkbook Xwb;
	public static XSSFSheet Xsh;
	public static XSSFRow Row;
	public static XSSFCell cell;
	public static Scanner sc = new Scanner(System.in);
	public static Snaps  snp = new Snaps();
	
	public static String dataSheet(int row, int cel) throws IOException{
		try {
		FileInputStream excel = new FileInputStream("D:\\Users\\XY59005\\Desktop\\APP-B.xlsx");
	    Xwb = new XSSFWorkbook(excel);
	    Xsh=Xwb.getSheet("Sheet1");
	    cell=Xsh.getRow(row).getCell(cel);
	    String cellValue = cell.getStringCellValue();
	    System.out.println(cellValue);
	    snp.snaps(cellValue);
	    return cellValue;
		} catch (Exception e){
			System.out.print("Data not found. Press any key to cintinue ! ");
			sc.nextLine();
			
		}
		return null;
	}

}
