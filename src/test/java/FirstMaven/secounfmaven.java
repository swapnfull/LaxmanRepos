package FirstMaven;
import java.util.Random;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secounfmaven {
private WebDriver driver;
FirefoxOptions firefoxoptions = new FirefoxOptions();
ChromeOptions chromeoptions = new ChromeOptions();
EdgeOptions  edgeoptions = new EdgeOptions();
String KT = "";
String gold = "";
String text = "";
String size = "";
String name = "";
int number;  
String price;
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
System.out.println("Executing on Chrome");
}
else if(browser.equalsIgnoreCase("edge"))
{
WebDriverManager.edgedriver().setup();
 driver = new EdgeDriver(); 
System.out.println("Executing on Edge");
}
} 


public void AttributeSelection()
{
Random dice = new Random();

for(int counter=1; counter<=5; counter++){
number = 1+dice.nextInt(4);
System.out.print(number );



switch(number)  
{  
case 1:   
    System.out.println("condition 1"); 
     KT="(//li[@id='14KT'])[1]";
     gold = "(//li[@id='RG'])[1]";
     text = "Value";
     size = "(//input[@id='smalljewelery'])[1]";
     name = "Jessica";
     

    break;  

case 2:   
    System.out.println("condition 2"); 
     KT="(//li[@id='10KT'])[1]";
     gold = "(//li[@id='RG'])[1]";
     text = "Value";
     size = "(//input[@id='largejewelery'])[1]";
     name = "matthew";
    break;  

case 3:   
    System.out.println("condition 3");  
     KT="(//li[@id='14KT'])[1]";
     gold = "(//li[@id='WG'])[1]";
     text = "Value";
     size = "(//input[@id='largejewelery'])[1]";
     name = "Katerose";
    break;  

case 4:   
    System.out.println("condition 4");  
     KT="(//li[@id='10KT'])[1]";
     gold = "(//li[@id='RG'])[1]";
     text = "Value";
     size = "(//input[@id='largejewelery'])[1]";
     name = "diamond";
    break;  

case 5:   
    System.out.println("condition 5");  
     KT="(//li[@id='14KT'])[1]";
     gold = "(//li[@id='WG'])[1]";
     text = "Standard";
     size = "(//input[@id='smalljewelery'])[1]";
     name = "robin";
    break;  

  default:   
      System.out.println("out of condition ");  
}  
}}


@Test (priority =1)	 
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
System.out.println("ScriptNameNecklace");

AttributeSelection();
//AttributeSelection
// Add the logic for prices based on the cases
if (number == 1) {
 price = "S465";
} else if (number == 2) {
 price = "$605";
} else if (number == 3) {
 price = "$685";
} else if (number == 4) {
 price = "$565";
} else if (number == 5) {
 price = "$490";
} 



driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");//Open
Thread.sleep(8000);
     driver.findElement(By.xpath(KT)).click(); //14KT Box
     Thread.sleep(1000);
     driver.findElement(By.xpath(gold)).click();  //RG Box
     Thread.sleep(1000);
     // Create the object of the Select class
     Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
     // Select the option using the visible text
     se.selectByVisibleText(text);    //Standard
     Thread.sleep(1000);
     driver.findElement(By.xpath(size)).click();  //Large
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);  //EnterName
     Thread.sleep(1000);
     driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click(); //Preview
     Thread.sleep(15000);


//VerifyAmountOnDetailPage
String Amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[name()='path'])[57]")).click(); //AddToCart
Thread.sleep(4000);

//VerifyAmountOnPopUp
String PopUpAmount = driver.findElement(By.xpath("(//big[normalize-space()='" + price + "'])[1]")).getText();
//System.out.println(PopUpAmount);

Thread.sleep(1000);
driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click(); //View Order Cart
Thread.sleep(6000);

//OrderCartPage

String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();

System.out.println(Amount);
if(Amount.contentEquals(price))
{
System.out.println("Amount is correctly showing on detail page");
}
else
System.out.println("Incorrect Amount on detail page");

if(PopUpAmount.contentEquals(price))
{
System.out.println("Amount is correctly showing on PopUp");
}
else
System.out.println("Incorrect Amount on PopUp");


if(CartText.contains("Name: Testing | 14 KT | Rose Gold"))
{
System.out.println("All Attribute is correct in OrderCart");
}
else
System.out.println("Incorrect Attribute in OrderCart");

if(CartStylePrice.contentEquals(price))
{
System.out.println("Style Price is correct in Cart");
}
else
System.out.println("Incorrect Style Price in OrderCart");

if(CartTotalPrice.contentEquals(price))
{
System.out.println("Total Price is correct in OrderCart");
}
else
System.out.println("Incorrect Total Price in OrderCart");	
}


@Test (priority =2)	 
public void ScriptBlockNameNecklace() throws Exception{
	System.out.println("ScriptBlockNameNecklace");

AttributeSelection();

if (number == 1) {
    price = "S380";
} else if (number == 2) {
    price = "$380";
} else if (number == 3) {
    price = "$495";
} else if (number == 4) {
    price = "$395";
} else if (number == 5) {
    price = "$410";
} 

    driver.get("https://www.ashidiamonds.com/Product/DiamondBlockNameNecklace");//Open
    Thread.sleep(8000);
    driver.findElement(By.xpath(KT)).click(); //14KT Box
    Thread.sleep(1000);
    driver.findElement(By.xpath(gold)).click();  //RG Box
    Thread.sleep(1000);
    // Create the object of the Select class
    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
    // Select the option using the visible text
    se.selectByVisibleText(text);    //Standard
    Thread.sleep(1000);
    driver.findElement(By.xpath(size)).click();  //Large
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);  //EnterName
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click(); //Preview
    Thread.sleep(15000);
    
    //VerifyAmountOnDetailPage
    String Amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
    //System.out.println(Amount);
    if(Amount.contentEquals(price))
    {
    System.out.println("Amount is correctly showing on detail page");
    }
    else
    System.out.println("Incorrect Amount on detail page");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//*[name()='path'])[57]")).click(); //AddToCart
    Thread.sleep(1000);
    
    //VerifyAmountOnPopUp
    String PopUpAmount = driver.findElement(By.xpath("(//big[normalize-space()='" + price + "'])[1]")).getText();
    //System.out.println(PopUpAmount);
    if(PopUpAmount.contentEquals(price))
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
    
    if(CartStylePrice.contentEquals(price))
    {
    System.out.println("Style Price is correct in Cart");
    }
    else
    System.out.println("Incorrect Style Price in OrderCart");
    
    if(CartTotalPrice.contentEquals(price))
    {
    System.out.println("Total Price is correct in OrderCart");
    }
    else
    System.out.println("Incorrect Total Price in OrderCart");
    
    
    }

@Test (priority =3)	 
public void SpaceNameNecklace() throws Exception{
    System.out.println("SpaceNameNecklace");

AttributeSelection();

if (number == 1) {
    price = "S420";
} else if (number == 2) {
    price = "$420";
} else if (number == 3) {
    price = "$540";
} else if (number == 4) {
    price = "$435";
} else if (number == 5) {
    price = "$435";
} 

    driver.get("https://www.ashidiamonds.com/Product/DiamondSpaceNameNecklace");//Open
    Thread.sleep(8000);
    driver.findElement(By.xpath(KT)).click(); //14KT Box
    Thread.sleep(1000);
    driver.findElement(By.xpath(gold)).click();  //RG Box
    Thread.sleep(1000);
    // Create the object of the Select class
    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
    // Select the option using the visible text
    se.selectByVisibleText(text);    //Standard
    Thread.sleep(500);
    driver.findElement(By.xpath(size)).click();  //Large
    Thread.sleep(500);
    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);  //EnterName
    Thread.sleep(500);
    driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click(); //Preview
    Thread.sleep(15000);
    
    //VerifyAmountOnDetailPage
    String Amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
    //System.out.println(Amount);
    if(Amount.contentEquals(price))
    {
    System.out.println("Amount is correctly showing on detail page");
    }
    else
    System.out.println("Incorrect Amount on detail page");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//*[name()='path'])[57]")).click(); //AddToCart
    Thread.sleep(1000);
    
    //VerifyAmountOnPopUp
    String PopUpAmount = driver.findElement(By.xpath("(//big[normalize-space()='" + price + "'])[1]")).getText();
    //System.out.println(PopUpAmount);
    if(PopUpAmount.contentEquals(price))
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
    
    if(CartStylePrice.contentEquals(price))
    {
    System.out.println("Style Price is correct in Cart");
    }
    else
    System.out.println("Incorrect Style Price in OrderCart");
    
    if(CartTotalPrice.contentEquals(price))
    {
    System.out.println("Total Price is correct in OrderCart");
    }
    else
    System.out.println("Incorrect Total Price in OrderCart");
      
    }

}
		
