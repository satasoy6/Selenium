package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2Firefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		
		driver.navigate().to("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("Register here")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Mike");
		
		driver.findElement(By.name("lastName")).sendKeys("Anderson");
		
		driver.findElement(By.name("phone")).sendKeys("2014456");
		
		driver.findElement(By.id("userName")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("123 Main Ave");
		
		driver.findElement(By.name("city")).sendKeys("California");
		
		driver.findElement(By.name("postalCode")).sendKeys("94534");
		
	//	driver.findElement(By.linkText("submit")).click();
		
		
		
	}

}
