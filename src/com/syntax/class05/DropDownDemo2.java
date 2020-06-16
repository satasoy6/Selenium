package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement continents=driver.findElement(By.id("continents"));
		
		Select select=new Select(continents);
		
		List<WebElement> options=select.getOptions();//It will return list of all options in the DropDown
		
		for(WebElement option : options) {
			String text=option.getText();
			System.out.println(text);
			
			if(text.equals("Africa")) {
				option.click();
				String DDtext=option.getText();
				if(DDtext.equals("Africa")) {
					System.out.println("Right option selected:::"+option.isSelected());
				}
				
	//			select.selectByVisibleText("Australia");//This is also 2nd way of selecting
				//How do i know multiple select is enabled
			}
		}
		
		boolean isMultiple=select.isMultiple();
		System.out.println("Is the continent DD multiple?::"+isMultiple);
		Thread.sleep(3000);
		tearDown();
		
	}
}
