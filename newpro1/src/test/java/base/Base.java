package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public static WebDriver openChromeBrowser() {
	System.setProperty("webdriver.chrome.driver", 
	"src\\test\\resources\\Browser\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	return driver;
}
public static WebDriver openfirefox() {
	System.setProperty("webdriver.edge.driver", 
	"src\\test\\resources\\Browser\\msedgedriver  .exe");
	WebDriver driver= new EdgeDriver();
	return driver;
}
}
