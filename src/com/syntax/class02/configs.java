package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class configs {

public static void main(String[] args) {
	
	String url = 
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get(url);
	
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	
	
	
	
}
	
	
}
