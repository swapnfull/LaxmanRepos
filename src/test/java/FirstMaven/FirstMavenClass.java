package FirstMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Random;
public class FirstMavenClass {
private WebDriver driver;
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
System.out.println("Executing on FireFox" + "\n" + "----------------------------");

}

else if(browser.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver(); 
 System.out.println("Executing on Chrome" + "\n" + "----------------------------");
}
else if(browser.equalsIgnoreCase("edge"))
{
WebDriverManager.edgedriver().setup();
 driver = new EdgeDriver(); 
 System.out.println("Executing on edge" + "\n" + "----------------------------");
}
} 

public void selection()
{
Random dice= new Random();
int number;

for(int counter=1; counter<=5; counter++){
number = 1+dice.nextInt(8);
System.out.println(number +" ");

}
}

@Test (priority=1)	 
public void ScriptNameNecklace() throws Exception {	
//login
				
driver.manage().window().maximize();
driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
driver.findElement(By.name("ctl00$ContentPlaceHolder1$JewelerIDss")).sendKeys("CARTJA11720");
driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailID")).sendKeys("Avalontester1@gmail.com");
driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("CARTJA12345");
Thread.sleep(1000);  Thread.sleep(2000);  
driver.findElement(By.id("ctl00_ContentPlaceHolder1_A1")).click();
Thread.sleep(1000);  Thread.sleep(4000);  

Random dice= new Random();
int number;

for(int counter=1; counter<=5; counter++){
number = 1+dice.nextInt(8);
System.out.println(number +" ");


//-------------------------------------------------
if(number==1)
{
//AttributeSelection

driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
Thread.sleep(8000);
driver.findElement(By.xpath("(//li[@id='14KT'])[1]")).click(); //14KT Box
Thread.sleep(1000);
driver.findElement(By.xpath("(//li[@id='RG'])[1]")).click();  //RG Box
Thread.sleep(1000);
// Create the object of the Select class
Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
// Select the option using the visible text
se.selectByVisibleText("Standard");    //Standard
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='largejewelery'])[1]")).click();  //Large
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testa");  //EnterName
Thread.sleep(1000);

}
if(number==2)
{

    driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
    Thread.sleep(8000);
    driver.findElement(By.xpath("(//li[@id='10KT'])[1]")).click(); //10KT Box
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//li[@id='YG'])[1]")).click();  //YG Box
    Thread.sleep(1000);
    // Create the object of the Select class
    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
    // Select the option using the visible text
    se.selectByVisibleText("Value");    //Value
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='smalljewelery'])[1]")).click();  //Medium
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testb");  //EnterName
    Thread.sleep(1000);
}



if(number==3)
{
    driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
    Thread.sleep(8000);
    driver.findElement(By.xpath("(//li[@id='14KT'])[1]")).click(); //14KT Box
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//li[@id='WG'])[1]")).click();  //WG Box
    Thread.sleep(1000);
    // Create the object of the Select class
    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
    // Select the option using the visible text
    se.selectByVisibleText("Better");    //Better
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='largejewelery'])[1]")).click();  //Large
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testc");  //EnterName
    Thread.sleep(1000); 
}


if(number==4)
{

    driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
    Thread.sleep(8000);
    driver.findElement(By.xpath("(//li[@id='10KT'])[1]")).click(); //10KT Box
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//li[@id='WG'])[1]")).click();  //WG Box
    Thread.sleep(1000);
    // Create the object of the Select class
    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
    // Select the option using the visible text
    se.selectByVisibleText("Better");    //Better
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='smalljewelery'])[1]")).click();  //Medium
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testd");  //EnterName
    Thread.sleep(1000);
    
}if(number==5)
{
    driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
    Thread.sleep(8000);
    driver.findElement(By.xpath("(//li[@id='10KT'])[1]")).click(); //10KT Box
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//li[@id='YG'])[1]")).click();  //YG Box
    Thread.sleep(1000);
    // Create the object of the Select class
    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
    // Select the option using the visible text
    se.selectByVisibleText("Value");    //Value
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='smalljewelery'])[1]")).click();  //Medium
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Teste");  //EnterName
    Thread.sleep(1000);
    
}

//---------------------------------------------------



























//AttributeSelection
/*System.out.println("ScriptNameNecklace");
System.out.println("-----------------------");
driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
Thread.sleep(8000);
driver.findElement(By.xpath("(//li[@id='14KT'])[1]")).click(); //14KT Box
Thread.sleep(1000);
driver.findElement(By.xpath("(//li[@id='RG'])[1]")).click();  //RG Box
Thread.sleep(1000);
// Create the object of the Select class
Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
// Select the option using the visible text
se.selectByVisibleText("Standard");    //Standard
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='largejewelery'])[1]")).click();  //Large
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testing");  //EnterName
*/



Thread.sleep(1000);
driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click(); //Preview
Thread.sleep(12000);

//VerifyAmountOnDetailPage
String Amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
System.out.println(Amount);
if(Amount.contentEquals("$725"))
{
System.out.println("Amount is correctly showing on detail page");
}
else
System.out.println("Incorrect Amount on detail page");
Thread.sleep(5000);
driver.findElement(By.xpath("(//*[name()='path'])[57]")).click(); //AddToCart
Thread.sleep(1000);

//VerifyAmountOnPopUp
String PopUpAmount = driver.findElement(By.xpath("(//big[normalize-space()='$725'])[1]")).getText();
//System.out.println(PopUpAmount);
if(PopUpAmount.contentEquals("$725"))
{
System.out.println("Amount is correctly showing on PopUp");
}
else
System.out.println("Incorrect Amount on PopUp");
Thread.sleep(500);
driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click(); //View Order Cart
Thread.sleep(6000);

//OrderCartPage

String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();

if(CartText.contains("Name: Testing | 14 KT | Rose Gold"))
{
System.out.println("All Attribute is correct in OrderCart");
}
else
System.out.println("Incorrect Attribute in OrderCart");

if(CartStylePrice.contentEquals("$725"))
{
System.out.println("Style Price is correct in Cart");
}
else
System.out.println("Incorrect Style Price in OrderCart");

if(CartTotalPrice.contentEquals("$725"))
{
System.out.println("Total Price is correct in OrderCart");
}
else
System.out.println("Incorrect Total Price in OrderCart");	
}
   
   /* @Test(priority=2)	
    	public void ScriptBlockNameNecklace() throws Exception{
        //AttributeSelection
    	System.out.println("ScriptBlockNameNecklace");
        System.out.println("-----------------------");
        driver.get("https://www.ashidiamonds.com/Product/DiamondBlockNameNecklace");//Open
        Thread.sleep(7000);
        driver.findElement(By.xpath("(//li[@id='14KT'])[1]")).click(); //14KT Box
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[@id='RG'])[1]")).click();  //RG Box
        Thread.sleep(1000);
        //Create the object of the Select class
        Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
        //Select the option using the visible text
        se.selectByVisibleText("Standard");    //Standard
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='largejewelery'])[1]")).click();  //Large
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testing");  //EnterName
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click(); //Preview
        Thread.sleep(15000);
        
        //VerifyAmountOnDetailPage
        String Amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
        //System.out.println(Amount);
        if(Amount.contentEquals("$550"))
        {
        System.out.println("Amount is correctly showing on detail page");
        }
        else
        System.out.println("Incorrect Amount on detail page");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[name()='path'])[57]")).click(); //AddToCart
        Thread.sleep(1000);
        
        //VerifyAmountOnPopUp
        String PopUpAmount = driver.findElement(By.xpath("(//big[normalize-space()='$550'])[1]")).getText();
        //System.out.println(PopUpAmount);
        if(PopUpAmount.contentEquals("$550"))
        {
        System.out.println("Amount is correctly showing on PopUp");
        }
        else
        System.out.println("Incorrect Amount on PopUp");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click(); //View Order Cart
        Thread.sleep(5000);
        
        //OrderCartPage
        
        String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
        String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
        String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
        
        if(CartText.contains("Name: TESTING | 14 KT | Rose Gold"))
        {
        System.out.println("All Attribute is correct in OrderCart");
        }
        else
        System.out.println("Incorrect Attribute in OrderCart");
        
        if(CartStylePrice.contentEquals("$550"))
        {
        System.out.println("Style Price is correct in Cart");
        }
        else
        System.out.println("Incorrect Style Price in OrderCart");
        
        if(CartTotalPrice.contentEquals("$550"))
        {
        System.out.println("Total Price is correct in OrderCart");
        }
        else
        System.out.println("Incorrect Total Price in OrderCart");
        
        
        }
    	@Test(priority=3)	
		    	public void DiamondSpaceNameNecklace() throws Exception{
		        //AttributeSelection
	        System.out.println("DiamondSpaceNameNecklace");
	        System.out.println("-----------------------");
		        driver.get("https://www.ashidiamonds.com/Product/DiamondSpaceNameNecklace");//Open
		        Thread.sleep(7000);
		        driver.findElement(By.xpath("(//li[@id='14KT'])[1]")).click(); //14KT Box
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("(//li[@id='RG'])[1]")).click();  //RG Box
		        Thread.sleep(1000);
		        //Create the object of the Select class
		        Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
		        //Select the option using the visible text
		        se.selectByVisibleText("Standard");    //Standard
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("(//input[@id='largejewelery'])[1]")).click();  //Large
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys("Testing");  //EnterName
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click(); //Preview
		        Thread.sleep(15000);
		        
		        //VerifyAmountOnDetailPage
		        String Amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
		        //System.out.println(Amount);
		        if(Amount.contentEquals("$590"))
		        {
		        System.out.println("Amount is correctly showing on detail page");
		        }
		        else
		        System.out.println("Incorrect Amount on detail page");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("(//*[name()='path'])[57]")).click(); //AddToCart
		        Thread.sleep(1000);
		        
		        //VerifyAmountOnPopUp
		        String PopUpAmount = driver.findElement(By.xpath("(//big[normalize-space()='$590'])[1]")).getText();
		        //System.out.println(PopUpAmount);
		        if(PopUpAmount.contentEquals("$590"))
		        {
		        System.out.println("Amount is correctly showing on PopUp");
		        }
		        else
		        System.out.println("Incorrect Amount on PopUp");
		        Thread.sleep(500);
		        driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click(); //View Order Cart
		        Thread.sleep(5000);
		        
		        //OrderCartPage
		        
		        String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
		        String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
		        String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
		        
		        if(CartText.contains("Name: TESTING | 14 KT | Rose Gold"))
		        {
		        System.out.println("All Attribute is correct in OrderCart");
		        }
		        else
		        System.out.println("Incorrect Attribute in OrderCart");
		        
		        if(CartStylePrice.contentEquals("$590"))
		        {
		        System.out.println("Style Price is correct in Cart");
		        }
		        else
		        System.out.println("Incorrect Style Price in OrderCart");
		        
		        if(CartTotalPrice.contentEquals("$590"))
		        {
		        System.out.println("Total Price is correct in OrderCart");
		        }
		        else
		        System.out.println("Incorrect Total Price in OrderCart");
		        
		        
		        }





@AfterTest
public void tearDown() {
    // Close the driver here
    driver.quit();
}*/


}}
		
