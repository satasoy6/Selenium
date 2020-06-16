package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
	
	public static String url = "http://newtours.demoaut.com/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("a[href*='register']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Kadir");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Inanir");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("123455678");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("abcd@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("123 Main Ave");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Miami");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("FL");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("45678");
		driver.findElement(By.cssSelector("input#email")).sendKeys("tatarramazan");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234567");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("1234567");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		

	}

}
