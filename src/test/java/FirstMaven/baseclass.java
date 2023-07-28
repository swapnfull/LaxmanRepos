package FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Random;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public WebDriver driver;
	private Random random = new Random();
	int randomIndex = 0;
	
	
	
	String[] options = {
            "(//li[@id='14KT'])[1]",
            "(//li[@id='10KT'])[1]",
            "(//li[@id='14KT'])[1]",
            "(//li[@id='10KT'])[1]",
            "(//li[@id='14KT'])[1]"
};
String[] names = {
            "Jessica",
            "matthew",
            "Katerose",
            "diamond",
            "robin"
};

String[] texts = {
            "Value",
            "Value",
            "Value",
            "Value",
            "Standard"
};
      
String[] Golds = {
            "(//li[@id='WG'])[1]",
    		"(//li[@id='YG'])[1]",
    		"(//li[@id='WG'])[1]",
    		"(//li[@id='RG'])[1]",
            "(//li[@id='YG'])[1]"
    		
};

String[] dates = {
        "1.22.666",
        "01.02.2030",
        "11.22.20",
        "2023",
        "11.22.2055"
    };


int[] Dateprices = {425, 335, 460, 565, 615};


int[] prices = {465, 470, 685, 565, 615};


	public void setup() throws InterruptedException { 
	ChromeOptions chromeOptions = new ChromeOptions();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(chromeOptions); // Assign the created driver to the class-level variable
    driver.manage().window().maximize();
	
	}
	
	
	public void login() throws Exception { 
		 driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
         driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
         driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
         driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
         driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
         Thread.sleep(4000);		
}
	
	public void RanNum(){

        for (int i = 0; i < options.length; i++) {
            randomIndex = random.nextInt(options.length);
           System.out.println(randomIndex);
       }
    }
	
	
	
}
