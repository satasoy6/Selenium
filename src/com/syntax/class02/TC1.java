package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Ozel");
		
		driver.findElement(By.name("lastname")).sendKeys("Atasoy");
		
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
}
