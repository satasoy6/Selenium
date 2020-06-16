package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {
	
	public static String url =" http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String userName="Tester";
	public static String password="test";
	
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-0']"));//We will store this in an element so we can use it in the future
		System.out.println(maleRadioB.isDisplayed());//true is expected
		System.out.println(maleRadioB.isEnabled());//is it enabled to click on it--true
		System.out.println("Radio button is selected ::"+maleRadioB.isSelected());//is it already selected ? --false
		System.out.println("*************************");
		
		//first way to click on a Radio Button
		maleRadioB.click();
		System.out.println("Radio button is selected ::"+maleRadioB.isSelected());//now this will become true
		
		//How to identify group of elements
		List<WebElement> listRadioB=driver.findElements(By.xpath("//input[@name='exp']"));
		
		
	}
}
