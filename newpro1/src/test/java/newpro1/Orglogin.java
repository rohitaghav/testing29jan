package newpro1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orglogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibhav\\OneDrive\\Desktop\\rohit\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    Mainorglogin mainorglogin =new Mainorglogin(driver);
	    
	    mainorglogin.user();
	    mainorglogin.pass();
	    mainorglogin.loginclick();
	    
	    Recruitment recruitment=new Recruitment( driver);
	    recruitment.recruitment();
	    String title=driver.getTitle();
	    System.out.println(title );
	    if(title.equals("OrangeHRM")) {
	    	System.out.println("pass");
	    }
	    else {
	    	System.out.println("fail");
	    }
	    Thread.sleep(3000);
	    recruitment.jobtitle();
	    recruitment.name();
	    recruitment.namel();
	    recruitment.log();
	    Thread.sleep(3000);

	    recruitment.logout();
	}

}
