package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		//1set a system property
		// use this path for mac
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.close();
//		
	}
}
