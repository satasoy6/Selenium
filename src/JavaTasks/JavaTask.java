package JavaTasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTask {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		String filePath="/Users/seymaatasoy/eclipse-workspace/JavaBasics/configs/selenium.properties";
		WebDriver driver = new ChromeDriver();	
		
		
		FileInputStream fis = new FileInputStream (filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
	
		
		
		
		
	}
}
