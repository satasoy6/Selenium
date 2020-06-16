package JavaTasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {
	public static 	WebDriver driver;
	//WebDriver has to be available to all of the classes that's why it has to be public static
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath = System.getProperty("user.dir")+"/configs/configuration.properties";
		// we write user.dir separately because user name will change at every user
		System.out.println(filePath);
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties ();//This object holds the <k,V>in the file
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");//.toLowerCase(); that works too or inside switch case
		
	//	WebDriver driver = null; //you can either initialize or public static webdriver
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
			break;
			
		}
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
