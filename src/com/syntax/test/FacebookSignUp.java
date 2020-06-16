package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FacebookSignUp extends CommonMethods{

	/*
	 * Using functions ONLY sign up to Facebook account
	 */
	public static void main(String[] args) {
		
		setUp();
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		WebElement lastName=driver.findElement(By.name("lastname"));
		WebElement email=driver.findElement(By.name("reg_email__"));
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		WebElement confirmEmail=driver.findElement(By.name("reg_email_confirmation__"));
		
		sendText(firstName, ConfigsReader.getProperty("firstName"));
		sendText(lastName, ConfigsReader.getProperty("lastName"));
		sendText(email,ConfigsReader.getProperty("email"));
		sendText(confirmEmail, ConfigsReader.getProperty("email"));
		sendText(password,ConfigsReader.getProperty("password"));
	
		WebElement monthDD=driver.findElement(By.id("month"));
		selectDdValue(monthDD,9);
		WebElement dayDD=driver.findElement(By.id("day"));
		selectDdValue(dayDD,3);
		WebElement yearDD=driver.findElement(By.id("year"));
		yearDD.sendKeys("1988");
		
		WebElement gender=driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		
		
		
		WebElement signUp=driver.findElement(By.name("websubmit"));
		
		

	}
	
}
