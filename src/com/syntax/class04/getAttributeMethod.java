package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {

	
		public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			WebElement userName=driver.findElement(By.name("txtUsername"));
			userName.sendKeys("Admin");
			String text=userName.getAttribute("value");//it will return the value of any attribute you specify
			System.out.println(text);
			//getAttribute is used to retrieve the value of any attribute
			//if it has class attribute it will get class
		
		
	}
}
