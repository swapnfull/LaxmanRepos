package ThirdMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
	public static void main(String[] args) throws InterruptedException
	{
		// Launch Chrome
		//ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver(chromeOptions); // Assign the created driver to the class-level variable
        
		//Create Object
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
		LoginUsingPF LP =new LoginUsingPF(driver);
		ScriptNameN  SN = new ScriptNameN(driver);
		
		driver.get("https://www.ashidiamonds.com/LoginPage.aspx");
		LP.enterusername("CARTJA11720");
		Thread.sleep(500);
		LP.enteremail("Avalontester1@gmail.com");
		Thread.sleep(500);
		LP.enterpassword("CARTJA12345");
		Thread.sleep(500);
		LP.Loginbutton();
		Thread.sleep(1500);

		driver.get("https://www.ashidiamonds.com/Product/DiamondScriptNameNecklace");
		Thread.sleep(10000);
		SN.Goldbtn14();
		Thread.sleep(500);

		SN.GoldClorWG();
		Thread.sleep(500);
		SN.QualityDropdown();
		Thread.sleep(500);		
		SN.selectSize();
		Thread.sleep(500);
		SN.EditBox("abcd");
		Thread.sleep(500);
		SN.Previewbutton();
		Thread.sleep(500);
		SN.DPagePrice();
		Thread.sleep(500);
		SN.AddTOCart();
		//SN.PopUpAmount();
		//SN.ViewOrderCart();
		//SN.CartStyePrice();
		//SN.CartText();
		//SN.CartTtlPrice();
		//SN.CartRemovebutton();
		//SN.CartText();


		
		
	}
}



