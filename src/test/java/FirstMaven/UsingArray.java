package FirstMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

public class UsingArray {

private WebDriver driver;
private Random random = new Random();
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
    "Better",
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
"01.02.20",
"11.22.20",
"2023.24",
"11.22.55"
};

int[] Dateprices = {425, 460, 460, 365, 575};
int[] prices = {465, 705, 685, 565, 615};
int[] SpacePrices = {420, 480, 540, 435, 515};
int[] BlockPrices = {380, 440, 495, 395, 490};
int[] SBPrices = {385, 655, 605, 515, 535};
int[] BNBPrices = {305, 390, 420, 345, 410};
int[] DDBPrices = {345, 410, 380, 315, 455};


int randomIndex = 0;

    @BeforeTest
    public void setup() throws InterruptedException {
    	  ChromeOptions chromeOptions = new ChromeOptions();
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver(chromeOptions); // Assign the created driver to the class-level variable
          driver.manage().window().maximize();
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

























 
    @Test(priority=1)
    public void ScriptNameNecklace() throws InterruptedException {
       
        System.out.println("   " +'\n'+ "   " +'\n'+"-----------------" + '\n' + "ScriptNameNecklace");

        	RanNum();
           
            String Gold = Golds[randomIndex];
            String KT = options[randomIndex];
            String name = names[randomIndex];
            String text = texts[randomIndex];
            String size = "(//input[@id='" + (randomIndex < 2 ? "small" : "large") + "jewelery'])[1]";
            String price = "$" + prices[randomIndex];
            
            
            System.out.println("-----------"  +Gold);
            System.out.println("-----------"  +KT);
            System.out.println("-----------"  +name);
            System.out.println("-----------"  +text);
            System.out.println("-----------"  +size);
            System.out.println("-----------"  +price);


            driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");
            Thread.sleep(15000); //Main
            driver.findElement(By.xpath(KT)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(Gold)).click();
            Thread.sleep(1000);

            Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
            se.selectByVisibleText(text);
            Thread.sleep(1000);

            driver.findElement(By.xpath(size)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);
            Thread.sleep(1000);
            

            driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click();

            Thread.sleep(15000); //Main
            
            								//DetailPagePrice
            Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
        	      .withTimeout(Duration.ofSeconds(30))
        	      .pollingEvery(Duration.ofSeconds(2))
        	      .ignoring(NoSuchElementException.class);

        	WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='sellpriceforspo'])[1]")));
            Thread.sleep(6000);

        	String Amount =e1.getText();
            System.out.println("DetailspageAmount  - " +Amount);

            
            
            /*
        	Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
          	      .withTimeout(Duration.ofSeconds(30))
          	      .pollingEvery(Duration.ofSeconds(2))
          	      .ignoring(NoSuchElementException.class);

          	WebElement e2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='path'])[57]")));
              //Thread.sleep(200);
          	e2.click();*/
            
            //  Thread.sleep(15000);
           // String amount = driver.findElement(By.xpath("(//span[@id='sellpriceforspo'])[1]")).getText();
         
           // driver.findElement(By.xpath("(//a[normalize-space()='Add to Cart'])[1]")).click();
        	 Thread.sleep(2000);
        	 
        	 
        	 
        	 // Navigate to the web page

             WebElement element = driver.findElement(By.xpath("(//*[name()='path'])[57]"));

             JavascriptExecutor js = (JavascriptExecutor) driver;
             int yOffset = 100; // Adjust the value as per your requirement
             js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
        	 Thread.sleep(1000);

             element.click();

        
            
           //driver.findElement(By.xpath("(//*[name()='path'])[57]")).click();
           Thread.sleep(2000);
           String PopUpAmount = driver.findElement(By.xpath("//*[@id=\"Shoppingbagdetails\"]/div/div[2]/div[1]/div[2]/div[2]/big")).getText();

            System.out.println("popupAmount  - " +PopUpAmount);

            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click();
            Thread.sleep(2000);

            String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
            String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
            String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
           
            
            driver.findElement(By.xpath("(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")).click();
            
            System.out.println("-----------"  +price);
            System.out.println("-----------"  +CartTotalPrice);



           
            System.out.println(Amount);
            if(Amount.contentEquals(price))
            {
            System.out.println("DetailPageAmount -- OK");
            }
            else
            System.out.println("Incorrect Amount on detail page");
            
            if(PopUpAmount.contentEquals(price))
            {
            System.out.println("PopUpAmount -- OK");
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
            System.out.println("StylePriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Style Price in OrderCart");
            
            if(CartTotalPrice.contentEquals(price))
            {
            System.out.println("TotalPriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Total Price in OrderCart");	

        }



    
    @Test(priority=2)
    public void DateNameNecklace() throws InterruptedException {

        System.out.println("   " +'\n'+ "   " +'\n'+"-----------------" + '\n' + "DateNameNecklace");

        	
            RanNum();
            String Gold = Golds[randomIndex];
            String KT = options[randomIndex];
            String date = dates[randomIndex];
            String text = texts[randomIndex];
            String size = "(//input[@id='" + (randomIndex < 2 ? "small" : "large") + "jewelery'])[1]";
            System.out.println("Size is  - " +size);
            
            String Dateprice = "$" + Dateprices[randomIndex];

            System.out.println("-----------"  +Gold);
            System.out.println("-----------"  +KT);
            System.out.println("-----------"  +date);
            System.out.println("-----------"  +text);
            System.out.println("-----------"  +size);
            System.out.println("-----------"  +Dateprice);


            driver.get("https://www.ashidiamonds.com/Product/DiamondDateNecklace");
            Thread.sleep(15000); //Main
            driver.findElement(By.xpath(KT)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(Gold)).click();
            Thread.sleep(1000);

            Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
            se.selectByVisibleText(text);
            Thread.sleep(1000);

            driver.findElement(By.xpath(size)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(date);
            Thread.sleep(1000);
            

            driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW DATE'])[1]")).click();

            Thread.sleep(15000); //Main

            Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
        	      .withTimeout(Duration.ofSeconds(30))
        	      .pollingEvery(Duration.ofSeconds(2))
        	      .ignoring(NoSuchElementException.class);

        	WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='sellpriceforspo'])[1]")));
            Thread.sleep(200);

        	String Amount =e1.getText();
            System.out.println("DetailspageAmount  - " +Amount);
            Thread.sleep(2000);
      	 
        	 // Navigate to the web page

             WebElement element = driver.findElement(By.xpath("(//*[name()='path'])[57]"));

             JavascriptExecutor js = (JavascriptExecutor) driver;
             int yOffset = 100; // Adjust the value as per your requirement
             js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
        	 Thread.sleep(1000);

             element.click();

        
            
           //driver.findElement(By.xpath("(//*[name()='path'])[57]")).click();
           Thread.sleep(2000);
           String PopUpAmount = driver.findElement(By.xpath("//*[@id=\"Shoppingbagdetails\"]/div/div[2]/div[1]/div[2]/div[2]/big")).getText();

            System.out.println("popupAmount  - " +PopUpAmount);

            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click();
            Thread.sleep(2000);

            String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
            String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
            String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
           
            
            driver.findElement(By.xpath("(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")).click();
            
            System.out.println("-----------"  +Dateprice);
            System.out.println("-----------"  +CartTotalPrice);

            if(Amount.contentEquals(Dateprice))
            {
            System.out.println("DetailPageAmount -- OK");
            }
            else
            System.out.println("Incorrect Amount on detail page");
            
            if(PopUpAmount.contentEquals(Dateprice))
            {
            System.out.println("PopUpAmount -- OK");
            }
            else
            System.out.println("Incorrect Amount on PopUp");
            
            if(CartText.contains("Name: Testing | 14 KT | Rose Gold"))
            {
            System.out.println("All Attribute is correct in OrderCart");
            }
            else
            System.out.println("Incorrect Attribute in OrderCart");
            
            if(CartStylePrice.contentEquals(Dateprice))
            {
            System.out.println("StylePriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Style Price in OrderCart");
            
            if(CartTotalPrice.contentEquals(Dateprice))
            {
            System.out.println("TotalPriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Total Price in OrderCart");	

        }

























        @Test(priority=3)
        public void SpaceNameNecklace() throws InterruptedException {
            System.out.println("   " +'\n'+ "   " +'\n'+"-----------------" + '\n' + "SpaceNameNecklace");


            RanNum();
            String Gold = Golds[randomIndex];
            String KT = options[randomIndex];
            String name = names[randomIndex];
            String text = texts[randomIndex];
            String size = "(//input[@id='" + (randomIndex < 2 ? "small" : "large") + "jewelery'])[1]";
            System.out.println("Size is  - " +size);
            
            String SpacePrice = "$" + SpacePrices[randomIndex];

            System.out.println("-----------"  +Gold);
            System.out.println("-----------"  +KT);
            System.out.println("-----------"  +name);
            System.out.println("-----------"  +text);
            System.out.println("-----------"  +size);
            System.out.println("-----------"  +SpacePrice);


            driver.get("https://www.ashidiamonds.com/Product/DiamondSpaceNameNecklace");
            Thread.sleep(15000); //Main
            driver.findElement(By.xpath(KT)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(Gold)).click();
            Thread.sleep(1000);

            Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
            se.selectByVisibleText(text);
            Thread.sleep(1000);

            driver.findElement(By.xpath(size)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);
            Thread.sleep(1000);
            

            driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click();

            Thread.sleep(15000); //Main

            Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
        	      .withTimeout(Duration.ofSeconds(30))
        	      .pollingEvery(Duration.ofSeconds(2))
        	      .ignoring(NoSuchElementException.class);

        	WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='sellpriceforspo'])[1]")));
            Thread.sleep(200);

        	String Amount =e1.getText();
            System.out.println("DetailspageAmount  - " +Amount);
            Thread.sleep(2000);
      	 
        	 // Navigate to the web page

             WebElement element = driver.findElement(By.xpath("(//*[name()='path'])[57]"));

             JavascriptExecutor js = (JavascriptExecutor) driver;
             int yOffset = 100; // Adjust the value as per your requirement
             js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
        	 Thread.sleep(1000);

             element.click();

        
            
           //driver.findElement(By.xpath("(//*[name()='path'])[57]")).click();
           Thread.sleep(2000);
           String PopUpAmount = driver.findElement(By.xpath("//*[@id=\"Shoppingbagdetails\"]/div/div[2]/div[1]/div[2]/div[2]/big")).getText();

            System.out.println("popupAmount  - " +PopUpAmount);

            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click();
            Thread.sleep(2000);

            String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
            String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
            String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
           
            
            driver.findElement(By.xpath("(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")).click();
            
            System.out.println("-----------"  +SpacePrice);
            System.out.println("-----------"  +CartTotalPrice);

       
          
            if (KT.equals("(//li[@id='14KT'])[1]")) {
                KT = "14 KT";
            } else {
                KT = "10 KT";
            }

            if (Gold.equals("(//li[@id='WG'])[1]")) {
                Gold = "White Gold";
            } else if (Gold.equals("(//li[@id='YG'])[1]")) {
                Gold = "Yellow Gold";
            } else {
                Gold = "Rose Gold";
            }


            if (CartText.contains("Name: " + name + " | " + KT + " | " + Golds)) {
                System.out.println("All attributes are correct in OrderCart");
            } else {
                System.out.println("Incorrect attributes in OrderCart");
            }


            
            
            
            
            
            
            
          
            if(Amount.contentEquals(SpacePrice))
            {
            System.out.println("DetailPageAmount -- OK");
            }
            else
            System.out.println("Incorrect Amount on detail page");
            
            if(PopUpAmount.contentEquals(SpacePrice))
            {
            System.out.println("PopUpAmount -- OK");
            }
            else
            System.out.println("Incorrect Amount on PopUp");
            
            if(CartText.contains("Name: Testing | 14 KT | Rose Gold"))
            {
            System.out.println("All Attribute is correct in OrderCart");
            }
            else
            System.out.println("Incorrect Attribute in OrderCart");
            
            if(CartStylePrice.contentEquals(SpacePrice))
            {
            System.out.println("StylePriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Style Price in OrderCart");
            
            if(CartTotalPrice.contentEquals(SpacePrice))
            {
            System.out.println("TotalPriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Total Price in OrderCart");	
        }























        @Test(priority=4)
        public void BlockNameNecklace() throws InterruptedException {
           
            System.out.println("   " +'\n'+ "   " +'\n'+"-----------------" + '\n' + "BlockNameNecklace");

        	RanNum();
            String Gold = Golds[randomIndex];
            String KT = options[randomIndex];
            String name = names[randomIndex];
            String text = texts[randomIndex];
            String size = "(//input[@id='" + (randomIndex < 2 ? "small" : "large") + "jewelery'])[1]";
            System.out.println("Size is  - " +size);
            
            String BlockPrice = "$" + BlockPrices[randomIndex];


            System.out.println("-----------"  +Gold);
            System.out.println("-----------"  +KT);
            System.out.println("-----------"  +name);
            System.out.println("-----------"  +text);
            System.out.println("-----------"  +size);
            System.out.println("-----------"  +BlockPrice);

        

            driver.get("https://www.ashidiamonds.com/Product/DiamondBlockNameNecklace");
            Thread.sleep(15000); //Main
            driver.findElement(By.xpath(KT)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(Gold)).click();
            Thread.sleep(1000);

            Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
            se.selectByVisibleText(text);
            Thread.sleep(1000);

            driver.findElement(By.xpath(size)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);
            Thread.sleep(1000);
            

            driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click();

            Thread.sleep(15000); //Main
            
            								//DetailPagePrice
            Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
        	      .withTimeout(Duration.ofSeconds(30))
        	      .pollingEvery(Duration.ofSeconds(2))
        	      .ignoring(NoSuchElementException.class);

        	WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='sellpriceforspo'])[1]")));
            Thread.sleep(6000);

        	String Amount =e1.getText();
            System.out.println("DetailspageAmount  - " +Amount);

            
            Thread.sleep(2000);
        	 
        	 
        	 
        	 // Navigate to the web page

             WebElement element = driver.findElement(By.xpath("(//*[name()='path'])[57]"));

             JavascriptExecutor js = (JavascriptExecutor) driver;
             int yOffset = 100; // Adjust the value as per your requirement
             js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
        	 Thread.sleep(1000);

             element.click();

        
            
           //driver.findElement(By.xpath("(//*[name()='path'])[57]")).click();
           Thread.sleep(2000);

            String PopUpAmount = driver.findElement(By.xpath("//*[@id=\"Shoppingbagdetails\"]/div/div[2]/div[1]/div[2]/div[2]/big")).getText();
            System.out.println("popupAmount  - " +PopUpAmount);

            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click();
            Thread.sleep(2000);

            String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
            String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
            String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
           
            
            driver.findElement(By.xpath("(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")).click();
            
            System.out.println("------------" +BlockPrice);
            System.out.println("------------" +CartTotalPrice);

            if(Amount.contentEquals(BlockPrice))
            {
            System.out.println("DetailPageAmount -- OK");
            }
            else
            System.out.println("Incorrect Amount on detail page");
            
            if(PopUpAmount.contentEquals(BlockPrice))
            {
            System.out.println("PopUpAmount -- OK");
            }
            else
            System.out.println("Incorrect Amount on PopUp");
            
            if(CartText.contains("Name: Testing | 14 KT | Rose Gold"))
            {
            System.out.println("All Attribute is correct in OrderCart");
            }
            else
            System.out.println("Incorrect Attribute in OrderCart");
            
            if(CartStylePrice.contentEquals(BlockPrice))
            {
            System.out.println("StylePriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Style Price in OrderCart");
            
            if(CartTotalPrice.contentEquals(BlockPrice))
            {
            System.out.println("TotalPriceAmount -- OK");
            }
            else
            System.out.println("Incorrect Total Price in OrderCart");	


    }
        
        @Test(priority=5)
        public void DiamondScriptBracellet() throws InterruptedException {
         
            System.out.println("   " +'\n'+ "   " +'\n'+"-----------------" + '\n' + "DiamondScriptBracellet");

            	RanNum();
               
                String Gold = Golds[randomIndex];
                String KT = options[randomIndex];
                String name = names[randomIndex];
                String text = texts[randomIndex];
                String size = "(//input[@id='" + (randomIndex < 2 ? "small" : "large") + "jewelery'])[1]";
                String price = "$" + SBPrices[randomIndex];
                
                
                System.out.println("-----------"  +Gold);
                System.out.println("-----------"  +KT);
                System.out.println("-----------"  +name);
                System.out.println("-----------"  +text);
                System.out.println("-----------"  +size);
                System.out.println("-----------"  +price);


                driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameBracelet");
                Thread.sleep(15000); //Main
                driver.findElement(By.xpath(KT)).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath(Gold)).click();
                Thread.sleep(1000);

                Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
                se.selectByVisibleText(text);
                Thread.sleep(1000);

                driver.findElement(By.xpath(size)).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);
                Thread.sleep(1000);
                

                driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click();

                Thread.sleep(15000); //Main
                
                								//DetailPagePrice
                Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
            	      .withTimeout(Duration.ofSeconds(30))
            	      .pollingEvery(Duration.ofSeconds(2))
            	      .ignoring(NoSuchElementException.class);

            	WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='sellpriceforspo'])[1]")));
                Thread.sleep(6000);

            	String Amount =e1.getText();
                System.out.println("DetailspageAmount  - " +Amount);

                
                
               Thread.sleep(2000);
            	 
            	 
            	 
            	 // Navigate to the web page

                 WebElement element = driver.findElement(By.xpath("(//*[name()='path'])[57]"));

                 JavascriptExecutor js = (JavascriptExecutor) driver;
                 int yOffset = 100; // Adjust the value as per your requirement
                 js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
            	 Thread.sleep(1000);

                 element.click();

            
                
               //driver.findElement(By.xpath("(//*[name()='path'])[57]")).click();
               Thread.sleep(2000);
               String PopUpAmount = driver.findElement(By.xpath("//*[@id=\"Shoppingbagdetails\"]/div/div[2]/div[1]/div[2]/div[2]/big")).getText();

                System.out.println("popupAmount  - " +PopUpAmount);

                Thread.sleep(2000);
                driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click();
                Thread.sleep(2000);

                String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
                String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
                String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
               
                
                driver.findElement(By.xpath("(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")).click();
                
                System.out.println("-----------"  +price);
                System.out.println("-----------"  +CartTotalPrice);



               
                System.out.println(Amount);
                if(Amount.contentEquals(price))
                {
                System.out.println("DetailPageAmount -- OK");
                }
                else
                System.out.println("Incorrect Amount on detail page");
                
                if(PopUpAmount.contentEquals(price))
                {
                System.out.println("PopUpAmount -- OK");
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
                System.out.println("StylePriceAmount -- OK");
                }
                else
                System.out.println("Incorrect Style Price in OrderCart");
                
                if(CartTotalPrice.contentEquals(price))
                {
                System.out.println("TotalPriceAmount -- OK");
                }
                else
                System.out.println("Incorrect Total Price in OrderCart");	

            }
        
            @Test(priority=6)
            public void DiamondBlockNameBracellet() throws InterruptedException {
               
                System.out.println("   " +'\n'+ "   " +'\n'+"-----------------" + '\n' + "DiamondBlockNameBracellet");

                    RanNum();
                   
                    String Gold = Golds[randomIndex];
                    String KT = options[randomIndex];
                    String name = names[randomIndex];
                    String text = texts[randomIndex];
                    String size = "(//input[@id='" + (randomIndex < 2 ? "small" : "large") + "jewelery'])[1]";
                    String price = "$" + BNBPrices[randomIndex];
                                      
                    System.out.println("-----------"  +Gold);
                    System.out.println("-----------"  +KT);
                    System.out.println("-----------"  +name);
                    System.out.println("-----------"  +text);
                    System.out.println("-----------"  +size);
                    System.out.println("-----------"  +price);  
        
                    driver.get("https://www.ashidiamonds.com/Product/DiamondBlockNameBracelet");
                    Thread.sleep(15000); //Main
                    driver.findElement(By.xpath(KT)).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(Gold)).click();
                    Thread.sleep(1000);
        
                    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
                    se.selectByVisibleText(text);
                    Thread.sleep(1000);
        
                    driver.findElement(By.xpath(size)).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(name);
                    Thread.sleep(1000);
                           
                    driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click();
        
                    Thread.sleep(15000); //Main
                    
                                                    //DetailPagePrice
                    Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                          .withTimeout(Duration.ofSeconds(30))
                          .pollingEvery(Duration.ofSeconds(2))
                          .ignoring(NoSuchElementException.class);
        
                    WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='sellpriceforspo'])[1]")));
                    Thread.sleep(6000);
        
                    String Amount =e1.getText();
                    System.out.println("DetailspageAmount  - " +Amount);
                     
                   Thread.sleep(2000);
                    
                     // Navigate to the web page
        
                     WebElement element = driver.findElement(By.xpath("(//*[name()='path'])[57]"));
        
                     JavascriptExecutor js = (JavascriptExecutor) driver;
                     int yOffset = 100; // Adjust the value as per your requirement
                     js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
                     Thread.sleep(1000);
        
                     element.click();
                   //driver.findElement(By.xpath("(//*[name()='path'])[57]")).click();
                   Thread.sleep(2000);
                   String PopUpAmount = driver.findElement(By.xpath("//*[@id=\"Shoppingbagdetails\"]/div/div[2]/div[1]/div[2]/div[2]/big")).getText();
        
                    System.out.println("popupAmount  - " +PopUpAmount);
        
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click();
                    Thread.sleep(2000);
        
                    String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
                    String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
                    String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
                            
                    driver.findElement(By.xpath("(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")).click();
                    
                    System.out.println("-----------"  +price);
                    System.out.println("-----------"  +CartTotalPrice);
                       
                    System.out.println(Amount);
                    if(Amount.contentEquals(price))
                    {
                    System.out.println("DetailPageAmount -- OK");
                    }
                    else
                    System.out.println("Incorrect Amount on detail page");
                    
                    if(PopUpAmount.contentEquals(price))
                    {
                    System.out.println("PopUpAmount -- OK");
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
                    System.out.println("StylePriceAmount -- OK");
                    }
                    else
                    System.out.println("Incorrect Style Price in OrderCart");
                    
                    if(CartTotalPrice.contentEquals(price))
                    {
                    System.out.println("TotalPriceAmount -- OK");
                    }
                    else
                    System.out.println("Incorrect Total Price in OrderCart");	
        
      
            }  
            
            @Test(priority=7)
            public void DiamondDateBracellet() throws InterruptedException {
               
                System.out.println("   " +'\n'+ "   " +'\n'+"-----------------" + '\n' + "DiamondDateBracellet");
                    RanNum();
                   
                    String Gold = Golds[randomIndex];
                    String KT = options[randomIndex];
                    String date = dates[randomIndex];
                    String text = texts[randomIndex];
                    String size = "(//input[@id='" + (randomIndex < 2 ? "small" : "large") + "jewelery'])[1]";
                    String price = "$" + DDBPrices[randomIndex];
                    
                    
                    System.out.println("-----------"  +Gold);
                    System.out.println("-----------"  +KT);
                    System.out.println("-----------"  +date);
                    System.out.println("-----------"  +text);
                    System.out.println("-----------"  +size);
                    System.out.println("-----------"  +price);
        
        
                    driver.get("https://www.ashidiamonds.com/Product/DiamondDateBracelet");
                    Thread.sleep(15000); //Main
                    driver.findElement(By.xpath(KT)).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(Gold)).click();
                    Thread.sleep(1000);
        
                    Select se = new Select(driver.findElement(By.xpath("(//select[@id='nnQuality'])[1]")));
                    se.selectByVisibleText(text);
                    Thread.sleep(1000);
        
                    driver.findElement(By.xpath(size)).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("(//input[@id='CustomNecklaceField'])[1]")).sendKeys(date);
                    Thread.sleep(1000);
                    
        
                    driver.findElement(By.xpath("(//a[normalize-space()='PREVIEW NAME'])[1]")).click();
        
                    Thread.sleep(15000); //Main
                    
                                                    //DetailPagePrice
                    Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                          .withTimeout(Duration.ofSeconds(30))
                          .pollingEvery(Duration.ofSeconds(2))
                          .ignoring(NoSuchElementException.class);
        
                    WebElement e1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@id='sellpriceforspo'])[1]")));
                    Thread.sleep(6000);
        
                    String Amount =e1.getText();
                    System.out.println("DetailspageAmount  - " +Amount);
        
                    
                    
                   Thread.sleep(2000);
                     
                     
                     
                     // Navigate to the web page
        
                     WebElement element = driver.findElement(By.xpath("(//*[name()='path'])[57]"));
        
                     JavascriptExecutor js = (JavascriptExecutor) driver;
                     int yOffset = 100; // Adjust the value as per your requirement
                     js.executeScript("window.scrollBy(0, arguments[0]);", yOffset);
                     Thread.sleep(1000);
        
                     element.click();
              
                   //driver.findElement(By.xpath("(//*[name()='path'])[57]")).click();
                   Thread.sleep(2000);
                   String PopUpAmount = driver.findElement(By.xpath("//*[@id=\"Shoppingbagdetails\"]/div/div[2]/div[1]/div[2]/div[2]/big")).getText();
        
                    System.out.println("popupAmount  - " +PopUpAmount);
        
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("(//a[normalize-space()='View Order Cart'])[1]")).click();
                    Thread.sleep(2000);
        
                    String CartText = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")).getText();
                    String CartStylePrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")).getText();
                    String CartTotalPrice = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")).getText();
                   
                    
                    driver.findElement(By.xpath("(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")).click();
                    
                    System.out.println("-----------"  +price);
                    System.out.println("-----------"  +CartTotalPrice);
        
        
        
                   
                    System.out.println(Amount);
                    if(Amount.contentEquals(price))
                    {
                    System.out.println("DetailPageAmount -- OK");
                    }
                    else
                    System.out.println("Incorrect Amount on detail page");
                    
                    if(PopUpAmount.contentEquals(price))
                    {
                    System.out.println("PopUpAmount -- OK");
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
                    System.out.println("StylePriceAmount -- OK");
                    }
                    else
                    System.out.println("Incorrect Style Price in OrderCart");
                    
                    if(CartTotalPrice.contentEquals(price))
                    {
                    System.out.println("TotalPriceAmount -- OK");
                    }
                    else
                    System.out.println("Incorrect Total Price in OrderCart");	
        
                    
                    
                    
                    
                    
                    
                } 
}  
    
    
    



  