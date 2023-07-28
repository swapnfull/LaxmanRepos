package FirstMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	private WebDriver driver;


@Parameters("browser")
@BeforeTest
public void launchapp(String browser) {

   if (browser.equalsIgnoreCase("firefox")) {
      System.out.println(" Executing on FireFox");
     
      // Setup Firefox driver using WebDriverManager
      WebDriverManager.firefoxdriver().setup();
      
      // Create a new instance of the Firefox driver
      WebDriver driver = new FirefoxDriver();
      
      // Open Google
      driver.get("https://www.google.com");
      
      
      driver.manage().window().maximize();
		 
   } else if (browser.equalsIgnoreCase("chrome")) {
      System.out.println(" Executing on CHROME");
		 
		 
		 ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.addArguments("--remote-allow-origins=*");
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver(chromeOptions); 
		 

      driver.get("https://www.google.com/");
     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
		} 
		 
   else {
      throw new IllegalArgumentException("The Browser Type is Undefined");
   } 
}
@AfterTest
public void closeBrowser() {
    if (driver != null) {
        driver.quit();
    }
}
}