package ThirdMaven;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ScriptNameN {
	WebDriver driver; //Initialize the webdriver here 
	//Constructor Here
	

	ScriptNameN(WebDriver d){
			
			driver =d;
			//This method will create Webelements
			PageFactory.initElements(driver, this);
		}
	

	@FindBy(xpath="(//li[@id='14KT'])[1]")
	WebElement KT14;
	
	@FindBy(xpath="(//li[@id='10KT'])[1]")
	WebElement KT10;
	
	@FindBy(xpath="(//li[@id='WG'])[1]")
	WebElement GoldWG;
	@FindBy(xpath="(//li[@id='RG'])[1]")
	WebElement GoldRG;
	@FindBy(xpath="(//li[@id='YG'])[1]")
	WebElement GoldYG;
	
	@FindBy(xpath="(//select[@id='nnQuality'])[1]")
	WebElement QltDrpdwn;
	
	@FindBy(xpath="(//input[@id='smalljewelery'])[1]")
	WebElement Size;
	
	
	@FindBy(xpath="(//input[@id='CustomNecklaceField'])[1]")
	WebElement Box;
	
	@FindBy(xpath="(//a[normalize-space()='PREVIEW NAME'])[1]")
	WebElement PreviewBTN;
	
	@FindBy(xpath="(//span[@id='sellpriceforspo'])[1]")
	WebElement DPprice;
	@FindBy(xpath="(//*[name()='path'])[57]")
	WebElement ATC;
	
	
	@FindBy(xpath="//*[@id=\\\"Shoppingbagdetails\\\"]/div/div[2]/div[1]/div[2]/div[2]/big")
	WebElement Popupamt;
	
	@FindBy(xpath="(//a[normalize-space()='View Order Cart'])[1]")
	WebElement ViewCart;
	
	@FindBy(xpath="/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[3]/p[2]/span[2]")
	WebElement CartTxt;
	
	@FindBy(xpath="/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[5]/p")
	WebElement CartStylePrice;
	
	@FindBy(xpath="/html/body/form/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[7]/p")
	WebElement CartTotalPrice;
	
	
	@FindBy(xpath="(//span[@class='icon_wishlist WishListIcon DIcon Remove01'])[1]")
	WebElement CartRemovebtn;
		
	public void Goldbtn14() {
		KT14.click();
	}
	public void Goldbtn10() {
		KT10.click();
	}
	public void GoldClorWG() {
		GoldWG.click();
	}
	public void GoldClorYG() {
		GoldYG.click();
	}
	public void GoldClorRG() {
		GoldRG.click();
	}
	
	public void QualityDropdown() {
	
		Select se = new Select(QltDrpdwn);
		se.selectByVisibleText("Better");
	}
	public void selectSize() {
		Size.click();
	}
	
	
	public void EditBox(String EditName) {
		Box.sendKeys(EditName);
	}
	public void DPagePrice() {
		String DPS = DPprice.getText();
		System.out.println(DPS);
	}
	
	
	public void Previewbutton() {
		PreviewBTN.click();
	}
	
	
	public void PopUpAmount() {
		Popupamt.getText();
	}
	public void AddTOCart() {
		ATC.click();
	}
	
	public void ViewOrderCart() {
		ViewCart.click();
	}
	public void CartStyePrice() {
		CartStylePrice.click();
	}
	public void CartText() {
		CartTxt.getText();
	}
	public void CartTtlPrice() {
		CartTotalPrice.getText();
	}
	public void CartRemovebutton() {
		CartRemovebtn.getText();
	}
	
    }


