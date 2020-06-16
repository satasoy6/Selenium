package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class MultiSelectDD extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement multiSelectDD=driver.findElement(By.id("continentsmultiple"));
		
		Select select=new Select(multiSelectDD);
		
		boolean isMultiple=select.isMultiple();
		System.out.println("This dropdown is multi select?::"+isMultiple);
		
		if(isMultiple) {
			select.selectByIndex(1);
			select.selectByVisibleText("Africa");
			Thread.sleep(2000);
			
			select.deselectAll();
		}
	}
}
