package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		
		driver.get("https://www.facebook.com");//will wait for the page to fully load /get method won't store the history of the browser
		driver.manage().window().fullscreen();//Makes the page fullscreen
		driver.navigate().to("https://www.facebook.com");
//		driver.navigate().to("https://google.com");//will store the history  
		 
		Thread.sleep(300);
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().back();
			
		Thread.sleep(400);
		driver.navigate().forward();
	}
	

}
