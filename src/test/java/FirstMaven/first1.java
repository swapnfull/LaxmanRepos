package FirstMaven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class first1 {
    public static void main(String[] args) {
    	

        // Setup Firefox driver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Close the browser
        driver.quit();
    }
}

