package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task0429 {
	/*
	 * Using xPath ONLY
TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info (skip dropdowns)
Click Submit
User successfully registered
Using Css ONLY
TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info (skip dropdowns)
Click Submit
User successfully registered
Collapse
	 */
	public static String url = "http://newtours.demoaut.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Fatma");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Girik");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("123 Main Ave");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("New York City");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("girikfatma");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@src='/images/forms/submit.gif']")).click();
		
		Thread.sleep(30000);
		driver.quit();
		
		
		
		
	}
}
