package JavaTasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Store configuration in property file to create an Amazon account:
browser
url
name
email
password
 * 
 */


public class Task2 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		String filePath =System.getProperty("user.dir")+"/configs/task.properties";
		System.out.println(filePath);
		
		FileInputStream fis = new FileInputStream (filePath);
		
		Properties prop = new Properties ();
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
	
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver=new FirefoxDriver();
			break;
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.cssSelector("input[name*='customerName']")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input[id*='ap_password_check']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input[id='continue']")).click();

		
		
		
		
		
		
		
	}
}
