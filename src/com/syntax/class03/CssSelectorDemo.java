package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id*='txtPass']")).sendKeys("Hum@nhrm123");//id* means contains
		driver.findElement(By.cssSelector("input[id^='btn']")).click();//id^ starts with
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class$='Trigger']")).click();//class$ ends with
		//there is no other way creating CSS custom.
		//input[id==' '] ---> find exact match
		//input[id*='txtPass']---> find contains 'txtPass'
		//input[id^='btn']--->starts with
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click(); 
		
	}
}
