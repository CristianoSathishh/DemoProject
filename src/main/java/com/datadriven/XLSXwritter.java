package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXwritter {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\sathi\\OneDrive\\Desktop\\ddd.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		//w.removePrintArea(2);
		w.createSheet("sathish").createRow(1).createCell(0).setCellValue("sathish@gmailcom");
		w.getSheet("sathish").getRow(1).createCell(1).setCellValue("123");
		w.getSheet("sathish").createRow(2).createCell(0).setCellValue("vicky");
		w.getSheet("sathish").getRow(2).createCell(1).setCellValue("12345");
		FileOutputStream fou=new FileOutputStream(f);
		w.write(fou);
		w.close();
		
		System.out.println("done");
		
	}

	}


