package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class task1 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement email=driver.findElement(By.id("email"));
		sendText(email,ConfigsReader.getProperty("email"));
		
		WebElement password=driver.findElement(By.id("pass"));
		sendText(password,ConfigsReader.getProperty("password"));
		
		
	}
}
