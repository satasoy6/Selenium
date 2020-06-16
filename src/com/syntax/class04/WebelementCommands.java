package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementCommands {
	
	public static String url ="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String userName="Tester";
	public static String password="test";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement usernam=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		
		usernam.sendKeys(userName);
		//I want to clear after writing it.
		Thread.sleep(2000);
		usernam.clear();//If i need to rewrite. first i need to clean it otherwise it will concatinate
		usernam.sendKeys(userName);
		
		WebElement pass=driver.findElement(By.cssSelector("input[name*='password']"));
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys(password);
		
		WebElement loginBtn=driver.findElement(By.cssSelector("input[value='Login']"));
		loginBtn.click();
		
		//I want to make sure Web Orders is displayed
		boolean logoIsDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		if(logoIsDisplayed) {
			System.out.println("Logo is displayed, Test Case passed");
		}else {
			System.out.println("Logo is NOT displayed, Test Case failed");
		}
		WebElement loginInfo=driver.findElement(By.xpath("//div[@class='login_info']"));
		String text=loginInfo.getText();//returns visible text in the UI you have
		if(text.contains("Tester")) {
			System.out.println("User successfully logged in, Test Case Passed");
		}else {
			System.out.println("User successfully NOT logged in, Test Case Failed");
		}
		
		
	}
	
}
