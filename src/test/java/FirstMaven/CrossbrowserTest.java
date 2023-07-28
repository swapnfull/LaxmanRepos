package FirstMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossbrowserTest{
	WebDriver driver;
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	ChromeOptions chromeoptions = new ChromeOptions();
	EdgeOptions  edgeoptions = new EdgeOptions();

@Parameters("browser")
@BeforeTest
public void initialize(String browser)
{
 if(browser.equalsIgnoreCase("firefox")) { 
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
System.out.println(" Executing on FireFox");
}

else if(browser.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver(); 
System.out.println(" Executing on Chrome");
}
else if(browser.equalsIgnoreCase("edge"))
{
WebDriverManager.edgedriver().setup();
 driver = new EdgeDriver(); 
System.out.println(" Executing on Edge");
}
 
 
}
@Test
public void citibanklogin()
{
driver.get("https://www.citi.com");
String actual = driver.getTitle();
String expect = "Citi";
Assert.assertEquals(actual.contains("citi"),expect.contains("citi"));
}
@AfterTest
public void closeBrowser() {
  
        driver.quit();
    }
}