package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {


	public static void main(String[] args) {
		/*Create driver object for firefox browser
		 * We will strictliy implement methods of webdriver.
		 * 
		 */
		
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\'#email\')).sendKeys(\'emailaddress\'")).sendKeys("emailaddress");
	}
}
