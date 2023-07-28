package ThirdMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUsingPF {

	WebDriver driver; //Initialize the webdriver here 
	
	//Constructor Here
	LoginUsingPF(WebDriver d){
		
		driver =d;
		//This method will create Webelements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="ctl00$ContentPlaceHolder1$JewelerIDss")
	WebElement Username;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$EmailID")
	WebElement Emailid;
	
	@FindBy(xpath="(//input[@id='ctl00_ContentPlaceHolder1_Password'])[1]")
	WebElement Password;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_A1")
	WebElement Submitbtn;
	
	public void enterusername(String UN) {
	
		Username.sendKeys(UN);
	}
	
	public void enteremail(String EM) {
		
		Emailid.sendKeys(EM);
	}
	public void enterpassword(String PW) {
		
		Password.sendKeys(PW);
	}
	
	public void Loginbutton() {
		Submitbtn.click();
	}

	

	
}
	

