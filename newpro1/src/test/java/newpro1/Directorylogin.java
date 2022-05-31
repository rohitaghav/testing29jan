package newpro1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Directorylogin {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibhav\\OneDrive\\Desktop\\rohit\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://opensource-demo.orangehrmlive.com/");
    
    Mainorglogin mainorglogin =new Mainorglogin(driver);
    
    mainorglogin.user();
    mainorglogin.pass();
    mainorglogin.loginclick();
    
    Directory  directory =new Directory(driver);
    directory.directory();
    directory.name();
    
    Recruitment recruitment=new Recruitment( driver);
    recruitment.log();
    recruitment.logout();
    
    
    
}
}
