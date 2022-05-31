package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	 public static WebDriver getscreenshot(WebDriver driver) throws IOException {
		 
		 TakesScreenshot t= (TakesScreenshot)driver;
		 
		 File source= t.getScreenshotAs(OutputType.FILE);
		 File path= new File("C:\\Users\\vaibhav\\eclipse-workspace\\newpro1\\test-output\\Screenshot\\rr.jpg");
		 FileHandler.copy(source, path);
		// C:\\Users\\vaibhav\\OneDrive\\Desktop\\Book1.xlsx
		 
		 //  test-output\\old\\Screenshot\\rr.pnb
		 return driver;
	 }
	 
//	public static String Excelsheet() throws EncryptedDocumentException, IOException {
//		String path=" C:\\Users\\vaibhav\\OneDrive\\Desktop\\Book1.xlsx";
//		FileInputStream file =new FileInputStream(path);
//	Workbook as=	WorkbookFactory.create(file);
//	Sheet ad=as.getSheet("Sheet1");
//	 Row af=ad.getRow(0);
//	 
//	Cell ag= af.getCell(0);
//	
//	 String aj=ag.getStringCellValue();
//	 return aj;
//	}
	
	
}
