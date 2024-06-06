package Dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ddttest {
	public void login(String username, String password) {
	
}
	
	@DataProvider(name ="datasuppiler")
	public void data() {
		String excelFilePath = System.getProperty("user.dir") + "\\files\\emp.xlsx";
		File excelFile = new File(excelFilePath);
		FileInputStream fis = null ;
		try {
			 fis = new FileInputStream(excelFile);
			
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			 workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
			workbook.getSheet(null)
			
		
			
			
			
		}
		
		
		

}
}