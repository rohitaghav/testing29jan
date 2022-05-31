package newpro1;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Screenshot;

public class Mainorglogin {
	@FindBy (xpath="//input[@id='txtUsername']") 
	private WebElement user;
	@FindBy (xpath="//input[@id='txtPassword']") 
	private WebElement pass;
	@FindBy (xpath="//[@type=\"submit\"]") 
	private WebElement loginclick;
	
	public Mainorglogin(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	public void user() throws EncryptedDocumentException, IOException {
	//String data= Screenshot.Excelsheet();
		user.sendKeys("admi");
	}
	public void pass() throws EncryptedDocumentException, IOException {
		//String data= Screenshot.Excelsheet();
		pass.sendKeys("admin123");;
	}
	
	public void loginclick() {
		loginclick.click();
	}
}
