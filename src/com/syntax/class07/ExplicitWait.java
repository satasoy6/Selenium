package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.drivers;

public class ExplicitWait extends drivers{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-elements-loading.html");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("startButton")).click();
		
		/*
		 * The explicit wait is used to tell the Web Driver to wait for certain conditions 
		 * (Expected Conditions) or the maximum time exceeded before throwing an 
		 * "ElementNotVisibleException". Explicit wait works with ExpectedConditionsClass 
		 * and wait untill condition becomes true or max amount of time is reached.
		 */
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		//Expected condition is a class which has several methods.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]")));
		//wait until welcome syntax technologies is written and visible.
		
		
		boolean text=driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]")).isDisplayed();
		System.out.println("Is First name is displayed ? "+text);
		
	//	driver.quit();
		
	}
}
