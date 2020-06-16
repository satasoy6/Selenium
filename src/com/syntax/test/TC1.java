package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) {
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']"));
	}
}
