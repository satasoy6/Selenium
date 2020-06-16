package com.syntax.class04;

import java.util.List;
import java.util.List.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioDemo {
	
	public static String url = "http://demoqa.com/automation-practice-form/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='sex-0']"));
		System.out.println(maleRadioB.isDisplayed());//is it present on the UI or not ?
		System.out.println(maleRadioB.isEnabled());//true
		System.out.println("Radio Btn is selected ::"+maleRadioB.isSelected());//false
		System.out.println("*************************");
		
		//first way to click on a radio button
		
		maleRadioB.click();
		System.out.println("Radio Btn is selected :: ");
		
		//second way to click on radio buttons
		List<WebElement> proList=driver.findElements(By.xpath("//input[@name='profession']"));
		int size=proList.size();
		System.out.println("Size of checkboxes are :: "+size);
		
		String valueToBeSelected="Manual Tester";
		
		for (WebElement profession : proList) {
			
			if(profession.isEnabled()) {//Checking if the check-box is enabled
				String value=profession.getAttribute("value");//get value of value attribute
				System.out.println(value);
				
				if(value.equals(valueToBeSelected)) {
					profession.click();
					break;
				}
			}
			
		}
	}

}
