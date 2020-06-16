package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static String userName="Admin";
	public static String password="Hum@nhrm123";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		WebElement username=driver.findElement(By.xpath("//span[@class='form-hint']"));

		
		
		
	}

}
