package newpro1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Recruitment {
	@FindBy (xpath="//a[@id=\"menu_recruitment_viewRecruitmentModule\"]") 
	private WebElement recruitment;
	@FindBy (xpath="//select[@id=\"candidateSearch_jobTitle\"]") 
	private WebElement jobtitle;
	@FindBy (xpath="//input[@id=\"candidateSearch_candidateName\"]") 
	private WebElement name;
	@FindBy (xpath="//label[@for=\"candidateSearch_candidateName\"]") 
	private WebElement namel;
	@FindBy (xpath="//a[@id=\"welcome\"]") 
	private WebElement log;
	@FindBy (xpath="//a[text()='Logout']") 
	private WebElement logout;
	 public Recruitment( WebDriver driver) {
		PageFactory.initElements(driver, this); 
		 
	 }
	 
	 public void recruitment() {
		 recruitment.click();
	 }
	 public void jobtitle ( ) {
		 jobtitle.click();
		 Select s=new Select(jobtitle);
		 s.selectByVisibleText("Automation Tester");
	 }
	 
	 public void name ( ) {
		 name.click();
		name.sendKeys("rohit");
	 } 
	 public void namel ( ) {
		String er= namel.getText();
		 System.out.println(er);
		 if(er.equals("Candidate Name")) {
			 System.out.println("pass");
		 }
	 }
	public void log() {
		log.click();
	}
	public void logout() {
		logout.click();
	} 
}
