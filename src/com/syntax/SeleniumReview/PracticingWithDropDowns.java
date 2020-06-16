package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticingWithDropDowns extends BaseClass{
	
	public static void main(String[] args) {
		
		setUp();
		
		List<WebElement> allDDs=driver.findElements(By.tagName("a"));
		
		
		
		
	}

}
