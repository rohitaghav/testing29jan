package newpro1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Directory {
@FindBy(xpath="//a[@id=\"menu_directory_viewDirectory\"]") 
private  WebElement directory;
@FindBy (xpath="//input[@name=\"searchDirectory[emp_name][empName]\"]") 
private WebElement name;

public  Directory(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void directory() {
	directory.click();
}
public void name () {
name.sendKeys("rohit");	
}
}

