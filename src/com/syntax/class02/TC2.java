package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.zillow.com/";
		driver.navigate().to(url);
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		if(url.contains("zillow")) {
			System.out.println("Url contains Zillow");
		}else {
			System.out.println("Navigated to wrong url");
		}
		
	}

}
