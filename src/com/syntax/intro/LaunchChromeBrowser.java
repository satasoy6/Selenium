package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
//		Making connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
//		Opening the browser by calling the constructor of ChromeDriver class and upcasting.	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.reddit.com");
		String expectedUrl = driver.getCurrentUrl();// Get the current url
		if(expectedUrl.equalsIgnoreCase("http://www.facebook.com")) {
			String title = driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong url is returned");
		}
		
		
	}
}
