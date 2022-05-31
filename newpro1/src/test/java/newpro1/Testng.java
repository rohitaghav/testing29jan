package newpro1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.Screenshot;
import base.Base;

public class Testng {
	WebDriver driver;
	Mainorglogin mainorglogin;
	 Directory  directory;
	 Recruitment recruitment;
	 
	@Parameters("browsrName")
    @BeforeTest
	 public void launchBrowser( String browser) {
		 if( browser.equals("chrome")) {
			 driver=Base.openChromeBrowser();
		 }
		 if( browser.equals("Firefox")) {
			 driver=Base.openfirefox();
		 }
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	 
	@BeforeClass
	public void beforeclass() {
			mainorglogin =new Mainorglogin(driver);
		   directory=new Directory(driver);
		  recruitment=new Recruitment( driver);
		  
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(3000);
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(3000);
		//     mainorglogin =new Mainorglogin(driver);
		    
		    mainorglogin.user();
		    mainorglogin.pass();
		    mainorglogin.loginclick();
	}
	@Test
	public void testa() {
		 //   directory =new Directory(driver);
		    directory.directory();
		    directory.name();
	}
	
	@Test
	public void testb() {
		
		 
		    recruitment.recruitment();
	}
	
	@AfterClass
	
		public void afterclass() {
		
		 mainorglogin=null;
		   directory=null;
		  recruitment=null;
	}
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
           driver=Screenshot.getscreenshot(driver);
		}
		
		
		Recruitment recruitment=new Recruitment( driver);
	    recruitment.log();
	    recruitment.logout();
		
	}
	@AfterTest
	public void aftertest() {
		driver.close();
		driver=null;
		System.gc();
	}
}
