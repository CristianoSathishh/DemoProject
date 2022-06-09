package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.adactin.properties.ConfigurationHelper;

public  class XLSXreader {
	public static  String cst;
	public static String xlsxReader(int sheet,int row,int cell) throws IOException {
		String s = ConfigurationHelper.getinstance().getinstanceCR().getreader();
		File f=new File(s);
		FileInputStream fis =new FileInputStream(f);
		Workbook w=new 	XSSFWorkbook(fis);
		Sheet st = w.getSheetAt(sheet);
		Row r = st.getRow(row);
		Cell c = r.getCell(cell);
		CellType ct = c.getCellType();
		if (ct.equals(CellType.STRING)) {
			cst = c.getStringCellValue();
			System.out.println(cst);
			
		}
		else if (ct.equals(CellType.NUMERIC)) {
			double nv = c.getNumericCellValue();
		int i=(int)nv;//narrowing big to small
		System.out.println(i);
		  cst = String.valueOf(i);//for accepting and return string value
		 System.out.println(cst);
			
		}
		return cst;
		
}
}
